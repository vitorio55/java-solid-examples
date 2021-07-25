package com.learning.solid.liskov_substitution.without;

import lombok.Getter;

@Getter
public class Square extends Rectangle {

    @Override
    public void setWidth(int newWidth) {
        this.width = newWidth;
        this.height = newWidth;
    }

    @Override
    public void setHeight(int newHeight) {
        this.width = newHeight;
        this.height = newHeight;
    }
}
