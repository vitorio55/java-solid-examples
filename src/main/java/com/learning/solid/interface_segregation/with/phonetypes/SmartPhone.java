package com.learning.solid.interface_segregation.with.phonetypes;

import com.learning.solid.interface_segregation.with.devicetypes.AppDevice;
import com.learning.solid.interface_segregation.with.devicetypes.ContactStorageDevice;
import lombok.Getter;

public class SmartPhone implements AppDevice, ContactStorageDevice, Telephone {
    @Getter
    String className;

    public SmartPhone() {
        className = this.getClass().getSimpleName();
    }

    // The latest smartphone

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
        System.out.printf("[%s] Turned device on!\n", className);
    }

    @Override
    public void powerOff() {
        System.out.printf("[%s] Turned device off!\n", className);
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
    public void installApp() {
        System.out.printf("[%s] Installed an app!\n", className);
    }

    @Override
    public void removeApp() {
        System.out.printf("[%s] Removed an app!\n", className);
    }
}
