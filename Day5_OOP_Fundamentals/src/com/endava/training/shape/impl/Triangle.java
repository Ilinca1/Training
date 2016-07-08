package com.endava.training.shape.impl;

import com.endava.training.shape.Shape2D;

/**
 * Created by ivamesu on 7/8/2016.
 */
public class Triangle implements Shape2D {

    float height;
    float base;
    float side1;
    float side2;

    public Triangle(float height, float base, float side1, float side2) {
        this.height = height;
        this.base = base;
        this.side1 = side1;
        this.side2 = side2;
    }
    @Override
    public float computeArea() {
        return height*base;
    }

    @Override
    public float computePerimeter() {
        return side1 + side2 + base;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "height=" + height +
                ", base=" + base +
                ", side1=" + side1 +
                ", side2=" + side2 +
                '}';
    }
}
