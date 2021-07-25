package com.learning.solid.open_closed.paymenttypes;

import com.learning.solid.open_closed.with.Payment;

public class CreditCardPayment implements Payment {
    String className;

    public CreditCardPayment() {
        className = this.getClass().getSimpleName();
    }

    @Override
    public void pay(float amount) {
        System.out.println("Paid " + amount + " using credit card! (in " + this.className + " class).");
    }
}
