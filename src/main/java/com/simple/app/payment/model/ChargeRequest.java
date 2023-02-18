package com.simple.app.payment.model;

import lombok.Data;

@Data
public class ChargeRequest {
    private String description;
    private int amount;
    private String currency;
    private String receiptEmail;
}
