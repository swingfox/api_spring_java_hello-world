package com.simple.app.entrypoint.api.rest.payment;

import com.simple.app.payment.model.ChargeRequest;
import com.stripe.exception.StripeException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


public interface PaymentController {

    @PostMapping("/payment")
    public void charge(@RequestBody ChargeRequest chargeRequest) throws StripeException;
}
