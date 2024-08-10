package org.example.clientbank.account.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record AddWithdrawFundsModel(
        @NotBlank(message = "Card number is required and cannot be blank")
        String cardNumber,

        @NotNull(message = "Sum is required and cannot be blank")
        double sum) {
}
