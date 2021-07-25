package com.learning.solid.interface_segregation.without.phonetypes;

import jdk.jshell.spi.ExecutionControl;
import lombok.Getter;

public class LandlinePhone extends Telephone {
    @Getter
    String className;

    public LandlinePhone() {
        className = this.getClass().getSimpleName();
    }

    // A traditional house-phone

    @Override
    public void call() {
        System.out.printf("[%s] Made a phone call!\n", className);
    }

    @Override
    public void hangUp() {
        System.out.printf("[%s] Hung up!\n", className);
    }

    @Override
    public void powerOn() throws ExecutionControl.NotImplementedException {
        // This operation is not supported for this phone type, throw an exception
        this.throwNotImplementedException(className);
    }

    @Override
    public void powerOff() throws ExecutionControl.NotImplementedException {
        // This operation is not supported for this phone type, throw an exception
        this.throwNotImplementedException(className);
    }

    @Override
    public void addContact() throws ExecutionControl.NotImplementedException {
        // This operation is not supported for this phone type, throw an exception
        this.throwNotImplementedException(className);
    }

    @Override
    public void removeContact() throws ExecutionControl.NotImplementedException {
        // This operation is not supported for this phone type, throw an exception
        this.throwNotImplementedException(className);
    }

    @Override
    public void installApp() throws ExecutionControl.NotImplementedException {
        // This operation is not supported for this phone type, throw an exception
        this.throwNotImplementedException(className);
    }

    @Override
    public void removeApp() throws ExecutionControl.NotImplementedException {
        // This operation is not supported for this phone type, throw an exception
        this.throwNotImplementedException(className);
    }
}
