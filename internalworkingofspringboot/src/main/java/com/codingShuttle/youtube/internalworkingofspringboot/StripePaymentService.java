package com.codingShuttle.youtube.internalworkingofspringboot;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name="payment.provider",havingValue = "stripe")

public class StripePaymentService implements PaymentService{

    @Override
    public String pay(){
        String payment ="stripe Payment";
        System.out.println("paying from.."+ payment);
        return payment;

    }
}
