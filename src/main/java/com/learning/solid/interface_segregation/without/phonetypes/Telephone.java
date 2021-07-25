package com.learning.solid.interface_segregation.without.phonetypes;

import jdk.jshell.spi.ExecutionControl;

public abstract class Telephone {

    // This abstract class (here executing the role of an Interface) is bloated. There are too many methods that will
    // clearly not be used by some of the concrete implementation classes

    abstract public void call() throws ExecutionControl.NotImplementedException;
    abstract public void hangUp() throws ExecutionControl.NotImplementedException;

    abstract public void powerOn() throws ExecutionControl.NotImplementedException;
    abstract public void powerOff() throws ExecutionControl.NotImplementedException;

    abstract public void addContact() throws ExecutionControl.NotImplementedException;
    abstract public void removeContact() throws ExecutionControl.NotImplementedException;

    abstract public void installApp() throws ExecutionControl.NotImplementedException;
    abstract public void removeApp() throws ExecutionControl.NotImplementedException;

    protected void throwNotImplementedException(String className) throws ExecutionControl.NotImplementedException {
        StackWalker walker = StackWalker.getInstance();
        String methodName = walker.walk(frames -> frames.skip(1).findFirst().map(StackWalker.StackFrame::getMethodName))
                .orElse("STACK-METHOD-NOT-FOUND").replace("Optional", "");
        throw new ExecutionControl.NotImplementedException(
                String.format("[%s] does not have the [%s] feature, but we still have to implement it.", className, methodName)
        );
    }
}
