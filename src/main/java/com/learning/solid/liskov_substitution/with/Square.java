package com.learning.solid.liskov_substitution.with;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Square extends Shape {
    int sidesMeasure;

    @Override
    protected int calculateArea() {
        return sidesMeasure * sidesMeasure;
    }
}
