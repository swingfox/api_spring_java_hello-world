package com.simple.app.entrypoint.api.rest.payment;

import com.simple.app.payment.model.ChargeRequest;
import com.stripe.exception.StripeException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@RequestMapping("/api/v1")
public interface PaymentController {

    @PostMapping("/payment")
    public void charge(@RequestBody ChargeRequest chargeRequest) throws StripeException;
}
