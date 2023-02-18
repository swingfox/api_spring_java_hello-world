package com.simple.app.entrypoint.api.rest.payment;

import com.simple.app.payment.service.PaymentService;
import com.simple.app.payment.model.ChargeRequest;
import com.stripe.exception.StripeException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4040")
public class PaymentControllerImpl implements PaymentController {
    private PaymentService paymentService;

    public PaymentControllerImpl(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void charge(@RequestBody ChargeRequest chargeRequest) throws StripeException {
        paymentService.charge(chargeRequest);
    }
}
