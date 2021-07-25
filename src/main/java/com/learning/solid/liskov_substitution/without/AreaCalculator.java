package com.learning.solid.liskov_substitution.without;

public class AreaCalculator {

    public static int calculateArea(Rectangle rectangle) {
        return rectangle.getWidth() * rectangle.getHeight();
    }
}
