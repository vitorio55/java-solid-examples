package com.learning.solid.dependency_inversion.with;

import com.learning.solid.Example;
import jdk.jshell.spi.ExecutionControl;

public class D_Example implements Example {

    @Override
    public void runExample() throws ExecutionControl.NotImplementedException {
        System.out.println("==> Running Dependency Inversion Principle example.");
    }
}
