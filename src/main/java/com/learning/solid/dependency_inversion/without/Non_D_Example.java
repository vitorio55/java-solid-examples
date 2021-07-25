package com.learning.solid.dependency_inversion.without;

import com.learning.solid.Example;
import com.learning.solid.dependency_inversion.without.vehicle.Car;
import com.learning.solid.dependency_inversion.without.vehicle.CombustionEngine;
import jdk.jshell.spi.ExecutionControl;

public class Non_D_Example implements Example {

    @Override
    public void runExample() throws ExecutionControl.NotImplementedException {
        System.out.println("==> Running Non-Dependency Inversion Principle example.");

        // Violation of the principle occurs here because a higher level entity (Car) is depending on a concrete
        // lower level entity (CombustionEngine). See each for more info.

        Car car = new Car(new CombustionEngine());
        car.startEngine();
        car.accelerate();
        car.stopEngine();
    }
}
