package com.herbalife.dto;

import jakarta.persistence.Column;

public record AccountDto(String accountNumber, int balance, String transactionType) {
}
