package com.learning.solid.open_closed.paymenttypes;

import com.learning.solid.open_closed.with.Payment;

public class TravelPointsPayment implements Payment {
    String className;

    public TravelPointsPayment() {
        className = this.getClass().getSimpleName();
    }

    @Override
    public void pay(float amount) {
        System.out.println("Paid " + amount+ " using travel points! (in " + this.className + " class).");
    }
}
