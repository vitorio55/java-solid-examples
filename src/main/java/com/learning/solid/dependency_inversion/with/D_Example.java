package com.learning.solid.dependency_inversion.with;

import com.learning.solid.Example;
import com.learning.solid.dependency_inversion.with.vehicle.Car;
import com.learning.solid.dependency_inversion.with.vehicle.CombustionEngine;
import com.learning.solid.dependency_inversion.with.vehicle.ElectricEngine;
import com.learning.solid.dependency_inversion.with.vehicle.Engine;
import jdk.jshell.spi.ExecutionControl;

import java.util.List;

public class D_Example implements Example {

    @Override
    public void runExample() throws ExecutionControl.NotImplementedException {
        System.out.println("==> Running Dependency Inversion Principle example.");

        Engine electricEngine = new ElectricEngine();
        Car electricCar = new Car(electricEngine);

        Engine combustionEngine = new CombustionEngine();
        Car combustionCar = new Car(combustionEngine);

        // Since both our higher level (Car) and lower level (Engine) entities don't depend on one another anymore, we
        // could easily add another engine class to the project and make a new type of car use it:

        // Engine nuclearEngine = new NuclearEngine();
        // Car nuclearCar = new Car(nuclearEngine);

        // The Dependency Inversion Principle is applied because:
        //   * Both our higher and lower level entities depend on an abstraction (Engine interface) and
        //   * The abstraction doesn't depend on details (Car or any engine concrete classes).

        // We can also safely loop here between higher level entities because the type of lower level entities is not
        // important in this logic level due to abstraction.

        List.of(combustionCar, electricCar).forEach((car -> {
            car.turnOn();
            car.accelerate();
            car.turnOff();
        }));
    }
}
