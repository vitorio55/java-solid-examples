package com.learning.solid.open_closed.paymenttypes;

import com.learning.solid.open_closed.with.Payment;

public class SavingsAccountPayment implements Payment {
    String className;

    public SavingsAccountPayment() {
        className = this.getClass().getSimpleName();
    }

    @Override
    public void pay(float amount) {
        System.out.println("Paid " + amount + " using savings account balance! (in " + this.className + " class).");
    }
}
