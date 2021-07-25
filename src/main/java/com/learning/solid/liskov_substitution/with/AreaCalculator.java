package com.learning.solid.liskov_substitution.with;

public class AreaCalculator {

    public static int calculateArea(Shape shape) {
        return shape.calculateArea();
    }
}
