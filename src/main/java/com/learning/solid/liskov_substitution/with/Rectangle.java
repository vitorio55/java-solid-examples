package com.learning.solid.liskov_substitution.with;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Rectangle extends Shape {
    int width;
    int height;

    @Override
    protected int calculateArea() {
        return width * height;
    }
}
