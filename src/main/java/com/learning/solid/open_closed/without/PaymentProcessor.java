package com.learning.solid.open_closed.without;

import com.learning.solid.open_closed.paymenttypes.*;

enum PaymentType {
    CHECKING_ACCOUNT_DEBIT,
    SAVINGS_ACCOUNT_DEBIT,
    TRAVEL_POINTS,
    CREDIT_CARD,
    CRYPTO
}

public class PaymentProcessor {

    public void processPayment(PaymentType paymentType) {
        // Violates the Open For Extension / Closed For Modification Principle since we must add each new
        // type of payment operation here.

        switch (paymentType) {
            case CHECKING_ACCOUNT_DEBIT:
                CheckingAccountDebitPayment checkingAccountDebitPayment = new CheckingAccountDebitPayment();
                System.out.print("[PaymentProcessor selected CheckingAccountDebitPayment]\n  ");
                checkingAccountDebitPayment.pay(15.50F);
                break;
            case SAVINGS_ACCOUNT_DEBIT:
                SavingsAccountPayment savingsAccountPayment = new SavingsAccountPayment();
                System.out.print("[PaymentProcessor selected SavingsAccountPayment]\n  ");
                savingsAccountPayment.pay(15.50F);
                break;
            case TRAVEL_POINTS:
                TravelPointsPayment travelPointsPayment = new TravelPointsPayment();
                System.out.print("[PaymentProcessor selected TravelPointsPayment]\n  ");
                travelPointsPayment.pay(15.50F);
                break;
            case CREDIT_CARD:
                CreditCardPayment creditCardPayment = new CreditCardPayment();
                System.out.print("[PaymentProcessor selected CreditCardPayment]\n  ");
                creditCardPayment.pay(15.50F);
                break;
            case CRYPTO:
                CryptoPayment cryptoPayment = new CryptoPayment();
                System.out.print("[PaymentProcessor selected CryptoPayment]\n  ");
                cryptoPayment.pay(15.50F);
                break;
            // ----------------------------------------------------------------------------------------------------------
            // A new payment method would require a new 'case' here. This means our class is not closed for modification.
            // ----------------------------------------------------------------------------------------------------------
        }

    }
}
