package com.learning.solid.single_responsibility.with;

public class UserAuthenticator {
    String className;

    public UserAuthenticator() {
        className = this.getClass().getSimpleName();
    }

    public void authenticateUser(String name) {
        System.out.println("Authenticated user (" + name + ") using (" + this.className + ").");
    }
}
