package com.learning.solid.liskov_substitution.without;

import com.learning.solid.Example;

public class Non_L_Example implements Example {

    @Override
    public void runExample() {
        System.out.println("==> Running Non-Liskov Substitution Principle example.");
        System.out.println("  Check and run unit tests for this example!");
    }
}
