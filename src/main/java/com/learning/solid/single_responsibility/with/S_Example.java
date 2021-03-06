package com.learning.solid.single_responsibility.with;

import com.learning.solid.Example;

public class S_Example implements Example {

    @Override
    public void runExample() {
        System.out.println("==> Running Single Responsibility Principle example.");

        DatabaseConnector dbConn = new DatabaseConnector();
        UserRepository userRepository = new UserRepository();
        UserAuthenticator userAuth = new UserAuthenticator();

        // Each responsibility of our scope here is divided into specific classes, according to the
        // Single Responsibility Principle.

        dbConn.connectToDatabase("<database_url>");
        userRepository.createUser("John");
        userRepository.changeUserName("Steve");
        userAuth.authenticateUser("Steve");
        dbConn.disconnectFromDatabase("<database_url>");
    }

}
