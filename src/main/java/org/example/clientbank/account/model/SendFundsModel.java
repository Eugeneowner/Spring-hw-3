package org.example.clientbank.account.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record SendFundsModel(
        @NotBlank(message = "Sender account number is required and cannot be blank")
        String numberFrom,

        @NotBlank(message = "Recipient account number is required and cannot be blank")
        String numberTo,

        @NotNull(message = "Sum is required and cannot be blank")
        double sum) {
}