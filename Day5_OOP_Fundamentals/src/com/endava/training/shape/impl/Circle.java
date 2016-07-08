package com.endava.training.shape.impl;

import com.endava.training.shape.Shape2D;

/**
 * Created by ivamesu on 7/8/2016.
 */
public class Circle implements Shape2D {
    float rad;

    public Circle(float rad) {
        this.rad = rad;
    }

    @Override
    public float computeArea() {
        return (float) (Math.PI * rad * rad);
    }

    @Override
    public float computePerimeter() {
        return (float) (2 * Math.PI *rad);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "rad=" + rad +
                '}';
    }
}
