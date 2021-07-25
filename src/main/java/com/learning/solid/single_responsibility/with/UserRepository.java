package com.learning.solid.single_responsibility.with;

public class UserRepository {
    String className;

    public UserRepository() {
        className = this.getClass().getSimpleName();
    }

    public void createUser(String name) {
        System.out.println("User (" + name + ") was created using (" + this.className + ").");
    }

    public void changeUserName(String name) {
        System.out.println("Changed user's name to (" + name + ") using (" + this.className + ").");
    }
}
