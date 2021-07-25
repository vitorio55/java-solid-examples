package com.learning.solid.open_closed.with;

import com.learning.solid.Example;
import com.learning.solid.open_closed.paymenttypes.*;

public class O_Example implements Example {

    @Override
    public void runExample() {
        System.out.println("==> Running Open / Closed Principle example.");

        PaymentProcessor paymentProcessor = new PaymentProcessor();
        CheckingAccountDebitPayment checkingAccountDebitPayment = new CheckingAccountDebitPayment();
        SavingsAccountPayment savingsAccountPayment = new SavingsAccountPayment();
        TravelPointsPayment travelPointsPayment = new TravelPointsPayment();
        CreditCardPayment creditCardPayment = new CreditCardPayment();
        CryptoPayment cryptoPayment = new CryptoPayment();

        // The PaymentProcessor class uses the Payment abstraction, therefore it is closed for modification and
        // open for extension.

        paymentProcessor.processPayment(checkingAccountDebitPayment);
        paymentProcessor.processPayment(savingsAccountPayment);
        paymentProcessor.processPayment(travelPointsPayment);
        paymentProcessor.processPayment(creditCardPayment);
        paymentProcessor.processPayment(cryptoPayment);
    }
}
