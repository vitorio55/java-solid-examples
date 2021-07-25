package com.learning.solid.liskov_substitution.without;

import lombok.Getter;

@Getter
public class Rectangle {
    protected int width;
    protected int height;

    public void setWidth(int newWidth) {
        this.width = newWidth;
    }

    public void setHeight(int newHeight) {
        this.height = newHeight;
    }
}
