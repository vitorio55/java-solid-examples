package com.learning.solid.dependency_inversion.with.vehicle;

public class Car {
    String className;
    Engine engine; // Abstraction

    public Car(Engine engine) {
        this.className = this.getClass().getSimpleName();
        this.engine = engine;
    }

    public void turnOn() {
        System.out.printf("[%s] Starting engine !\n   ", this.className);
        this.engine.start();
    }

    public void turnOff() {
        System.out.printf("[%s] Stopping engine !\n   ", this.className);
        this.engine.stop();
    }

    public void accelerate() {
        System.out.printf("[%s] Accelerating !\n   ", this.className);
        this.engine.accelerate();
    }
}
