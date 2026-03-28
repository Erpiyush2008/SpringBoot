package com.codingShuttle.youtube.internalworkingofspringboot;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperties;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name="payment.provider",havingValue = "razopay")
public class RazorpayPaymentService implements PaymentService {
    @Override
    public String pay(){
        String payment="Razorpay Payment";
        System.out.println("payment from ");
        return payment;
    }
}
