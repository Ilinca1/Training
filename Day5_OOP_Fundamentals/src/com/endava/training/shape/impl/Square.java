package com.endava.training.shape.impl;

import com.endava.training.shape.Shape2D;

/**
 * Created by ivamesu on 7/8/2016.
 */
public class Square implements Shape2D {

    float side1;

    public Square(float side1) {
        this.side1 = side1;
    }

    @Override
    public float computeArea() {
        return side1*side1;
    }

    @Override
    public float computePerimeter() {
        return side1*4;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side1=" + side1 +
                '}';
    }
}
