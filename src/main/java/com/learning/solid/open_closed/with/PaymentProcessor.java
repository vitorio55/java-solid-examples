package com.learning.solid.open_closed.with;

public class PaymentProcessor {

    public void processPayment(Payment payment) {
        // It doesn't matter here what kind of payment it is. It only matters that the payment implements the
        // Payment interface. Therefore to add a new payment type, we don't need to make changes to the
        // PaymentProcessor class, only to create a new Payment class that implements the interface.
        payment.pay(15.50F);
    }
}
