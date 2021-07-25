package com.learning.solid.open_closed.without;

import com.learning.solid.Example;

public class Non_O_Example implements Example {

    @Override
    public void runExample() {
        System.out.println("==> Running Non-Open / Closed Principle example.");

        PaymentProcessor payment = new PaymentProcessor();
        payment.processPayment(PaymentType.CHECKING_ACCOUNT_DEBIT);
        payment.processPayment(PaymentType.SAVINGS_ACCOUNT_DEBIT);
        payment.processPayment(PaymentType.TRAVEL_POINTS);
        payment.processPayment(PaymentType.CREDIT_CARD);
        payment.processPayment(PaymentType.CRYPTO);
        // To add a new payment here it would required a PaymentProcessor's class modification, which is violates
        // the Open For Extension / Closed For Modification Principle.
    }

}
