package com.endava.training.shape.impl;

/**
 * Created by ivamesu on 7/8/2016.
 */
public class Main {

    public static void main(String[] args) {

        Triangle triangle = new Triangle(1.5f,2.0f,1.5f,2.0f);
        Square square = new Square(2.5f);
        Circle circle = new Circle(2.5f);

        System.out.println("The circle " + circle + " has the perimeter " +
                circle.computePerimeter() + " and the area " + circle.computeArea());
        System.out.println("The triangle " + triangle + " has the perimeter " +
                triangle.computePerimeter() + " and the area " + triangle.computeArea());
        System.out.println("The square " + square + " has the perimeter " +
                square.computePerimeter() + " and the area " + square.computeArea());

    }
}
