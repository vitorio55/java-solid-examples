package com.learning.solid.liskov_substitution.with;

import com.learning.solid.Example;

public class L_Example implements Example {

    @Override
    public void runExample() {
        System.out.println("==> Running Liskov Substitution Principle example.");
        System.out.println("  Check and run unit tests for this example!");
    }
}
