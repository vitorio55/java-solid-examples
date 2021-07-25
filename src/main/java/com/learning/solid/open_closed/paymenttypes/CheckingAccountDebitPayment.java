package com.learning.solid.open_closed.paymenttypes;

import com.learning.solid.open_closed.with.Payment;

public class CheckingAccountDebitPayment implements Payment {
    String className;

    public CheckingAccountDebitPayment() {
        className = this.getClass().getSimpleName();
    }

    @Override
    public void pay(float amount) {
        System.out.println("Paid " + amount + " using checking account balance! (in " + this.className + " class).");
    }
}
