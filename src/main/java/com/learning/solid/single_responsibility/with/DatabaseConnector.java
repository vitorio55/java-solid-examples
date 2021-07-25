package com.learning.solid.single_responsibility.with;

public class DatabaseConnector {
    String className;

    public DatabaseConnector() {
        className = this.getClass().getSimpleName();
    }

    public void connectToDatabase(String url) {
        System.out.println("Connected to database on url (" + url + ") using (" + this.className + ").");
    }

    public void disconnectFromDatabase(String url) {
        System.out.println("Disconnected from database on url (" + url + ") using (" + this.className + ").");
    }
}
