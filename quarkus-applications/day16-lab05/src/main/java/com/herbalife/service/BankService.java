package com.herbalife.service;

import com.herbalife.dto.AccountTransactionDto;
import com.herbalife.entity.Account;
import com.herbalife.entity.AccountTransaction;
import com.herbalife.exception.AccountNotFoundException;
import com.herbalife.exception.InsufficientBalanceException;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;

import java.util.List;
import java.util.Optional;

@ApplicationScoped
public class BankService {
    @Transactional
    public void deposit(String accountNumber, int amount, String transactionType){
        Optional<Account> optionalAccount =  Account.find("accountNumber", accountNumber).firstResultOptional();

        if(!optionalAccount.isPresent())
            throw new AccountNotFoundException(accountNumber);

        Account account = optionalAccount.get();
        account.setBalance(account.getBalance()+amount);
        account.persist();

        createAccountTransaction(accountNumber, amount, transactionType);
    }

    private static void createAccountTransaction(String accountNumber, int amount, String transactionType) {
        AccountTransaction accountTransaction = new AccountTransaction();
        accountTransaction.setAccountNumber(accountNumber);
        accountTransaction.setAmount(amount);
        accountTransaction.setTransactionType(transactionType);
        accountTransaction.persist();
    }

    @Transactional
    public void withdraw(String accountNumber, int amount, String transactionType){
        Optional<Account> optionalAccount =  Account.find("accountNumber", accountNumber).firstResultOptional();

        if(!optionalAccount.isPresent())
            throw new AccountNotFoundException(accountNumber);

        Account account = optionalAccount.get();
        if(account.getBalance() < amount)
            throw new InsufficientBalanceException(accountNumber);
        account.setBalance(account.getBalance() - amount);
        account.persist();

        createAccountTransaction(accountNumber, amount, transactionType);
    }

    public List<AccountTransactionDto> printStatement(String accountNumber){
        Optional<Account> optionalAccount =  Account.findByIdOptional(accountNumber);

        if(!optionalAccount.isPresent())
            throw new AccountNotFoundException(accountNumber);
        Account account = optionalAccount.get();
        List<AccountTransaction> accountTransactions = account.getAccountTransactions();

        return accountTransactions.stream().map(accountTransaction -> new AccountTransactionDto(accountTransaction.getAccountNumber(), accountTransaction.getTransactionType(), accountTransaction.getAmount())).toList();
    }
}
