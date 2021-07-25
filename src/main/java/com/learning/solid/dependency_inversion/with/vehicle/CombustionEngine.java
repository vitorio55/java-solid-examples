package com.learning.solid.dependency_inversion.with.vehicle;

public class CombustionEngine implements Engine {
    String className;

    public CombustionEngine() {
        className = this.getClass().getSimpleName();
    }

    @Override
    public void accelerate() {
        this.injectGasoline();
    }

    @Override
    public void start() {
        this.injectGasolineAndTriggerInitialSpark();
    }

    @Override
    public void stop() {
        this.ceaseGasolineInjection();
    }

    public void injectGasolineAndTriggerInitialSpark() {
        System.out.printf("[%s] Injected gasoline and triggered initial spark.\n", this.className);
    }

    public void ceaseGasolineInjection() {
        System.out.printf("[%s] Ceased gasoline injection.\n", this.className);
    }

    public void injectGasoline() {
        System.out.printf("[%s] Injected gasoline.\n", this.className);
    }
}
