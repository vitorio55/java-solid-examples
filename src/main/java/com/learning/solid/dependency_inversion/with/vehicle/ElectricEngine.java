package com.learning.solid.dependency_inversion.with.vehicle;

public class ElectricEngine implements Engine {
    String className;

    public ElectricEngine() {
        className = this.getClass().getSimpleName();
    }

    @Override
    public void accelerate() {
        this.releaseElectricCurrent();
    }

    @Override
    public void start() {
        this.releaseInitialElectricCurrent();
    }

    @Override
    public void stop() {
        this.ceaseElectricCurrent();
    }

    private void releaseElectricCurrent() {
        System.out.printf("[%s] Released electric current.\n", this.className);
    }

    private void releaseInitialElectricCurrent() {
        System.out.printf("[%s] Released initial electric current.\n", this.className);
    }

    private void ceaseElectricCurrent() {
        System.out.printf("[%s] Ceased electric current.\n", this.className);
    }
}
