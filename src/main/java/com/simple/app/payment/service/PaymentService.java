package com.simple.app.payment.service;

import com.simple.app.payment.model.ChargeRequest;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.Charge;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Service
public class PaymentService {

    @Value("${application.stripe-secret-key}")
    private String secretKey;

    private int CURRENCY_MULTIPLIER = 100;

    @PostConstruct
    public void init() {
        Stripe.apiKey = secretKey;
    }

    public Charge charge(ChargeRequest chargeRequest) throws StripeException {
        Map<String, Object> chargeParams = new HashMap<>();
        chargeParams.put("amount", chargeRequest.getAmount()*CURRENCY_MULTIPLIER);
        chargeParams.put("currency", chargeRequest.getCurrency());
        chargeParams.put("receipt_email", chargeRequest.getReceiptEmail());
        chargeParams.put("source", "tok_visa");
        return Charge.create(chargeParams);
    }
}
