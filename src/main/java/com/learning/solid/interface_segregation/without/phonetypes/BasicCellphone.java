package com.learning.solid.interface_segregation.without.phonetypes;

import jdk.jshell.spi.ExecutionControl;
import lombok.Getter;

public class BasicCellphone extends Telephone {
    @Getter
    String className;

    public BasicCellphone() {
        className = this.getClass().getSimpleName();
    }

    // A 90's cellphone!

    @Override
    public void call() {
        System.out.printf("[%s] Made a phone call!\n", className);
    }

    @Override
    public void hangUp() {
        System.out.printf("[%s] Hung up!\n", className);
    }

    @Override
    public void powerOn() {
        System.out.printf("[%s] Turned phone on!\n", className);
    }

    @Override
    public void powerOff() {
        System.out.printf("[%s] Turned phone off!\n", className);
    }

    @Override
    public void addContact() {
        System.out.printf("[%s] Added a contact!\n", className);
    }

    @Override
    public void removeContact() {
        System.out.printf("[%s] Removed a contact!\n", className);
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
