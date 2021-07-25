package com.learning.solid.single_responsibility.without;

import com.learning.solid.Example;

public class Non_S_Example implements Example {

    @Override
    public void runExample() {
        System.out.println("==> Running Non-Single Responsibility Principle example.");

        // These operations should have their own specific classes
        connectToDatabase("<database_url>");
        createUser("John");
        changeUserName("Steve");
        authenticateUser("Steve");
        disconnectFromDatabase("<database_url>");
    }

    // This class has too many different responsibilities as seen below. Therefore there are many reasons
    // for this class to change, which violates the Single Responsibility Principle.

    public void connectToDatabase(String url) {
        System.out.println("[Example class] Connected to database on url (" + url + ").");
    }

    public void disconnectFromDatabase(String url) {
        System.out.println("[Example class] Disconnected from database on url (" + url + ").");
    }

    public void createUser(String name) {
        System.out.println("[Example class] User (" + name + ") was created.");
    }

    public void changeUserName(String name) {
        System.out.println("[Example class] Changed user's name to (" + name + ").");
    }

    public void authenticateUser(String name) {
        System.out.println("[Example class] Authenticated user (" + name + ").");
    }

}
