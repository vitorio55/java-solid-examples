package com.learning.solid.dependency_inversion.without;

import com.learning.solid.Example;
import jdk.jshell.spi.ExecutionControl;

public class Non_D_Example implements Example {

    @Override
    public void runExample() throws ExecutionControl.NotImplementedException {
        System.out.println("==> Running Non-Dependency Inversion Principle example.");

        // Violation of the principle occurs here because higher level entities (classes) are depending on
        // concrete lower level entities (classes)

    }
}
