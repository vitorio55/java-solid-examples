package com.learning.solid.open_closed.paymenttypes;

import com.learning.solid.open_closed.with.Payment;

public class CryptoPayment implements Payment {
    String className;

    public CryptoPayment() {
        className = this.getClass().getSimpleName();
    }

    @Override
    public void pay(float amount) {
        System.out.println("Paid " + amount + " using crypto! (in " + this.className + " class).");
    }
}
