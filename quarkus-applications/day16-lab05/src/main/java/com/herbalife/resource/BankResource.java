package com.herbalife.resource;

import com.herbalife.dto.AccountDto;
import com.herbalife.dto.AccountTransactionDto;
import com.herbalife.entity.AccountTransaction;
import com.herbalife.service.BankService;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;

import java.util.List;

@Path("/bank")
public class BankResource {
    @Inject
    BankService bankService;

    @POST
    @Path("/deposit")
    public void deposit(AccountDto accountDto){
        bankService.deposit(accountDto.accountNumber(), accountDto.balance(), accountDto.transactionType());
    }

    @POST
    @Path("/withdraw")
    public void withdraw(AccountDto accountDto){
        bankService.withdraw(accountDto.accountNumber(), accountDto.balance(), accountDto.transactionType());
    }

    @GET
    @Path("/statement/{accountNumber}")
    public List<AccountTransactionDto> statement(@PathParam("accountNumber") String accountNumber){
        return bankService.printStatement(accountNumber);
    }
}
