package com.learning.solid.dependency_inversion.without.vehicle;

public class CombustionEngine {
    String className;

    public CombustionEngine() {
        className = this.getClass().getSimpleName();
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
