package com.learning.solid.interface_segregation.with.phonetypes;

import lombok.Getter;

public class LandlinePhone implements Telephone {
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
}
