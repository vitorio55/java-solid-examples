package com.learning.solid.dependency_inversion.without.vehicle;

public class Car {
    String className;
    CombustionEngine engine; // This dependency is problematic

    public Car(CombustionEngine engine) {
        this.className = this.getClass().getSimpleName();
        this.engine = engine;
    }

    public void startEngine() {
        System.out.printf("[%s] Starting combustion engine !\n   ", this.className);
        this.engine.injectGasolineAndTriggerInitialSpark();
    }

    public void stopEngine() {
        System.out.printf("[%s] Stopping combustion engine !\n   ", this.className);
        this.engine.ceaseGasolineInjection();
    }

    public void accelerate() {
        System.out.printf("[%s] Accelerating combustion engine !\n   ", this.className);
        this.engine.injectGasoline();
    }
}
