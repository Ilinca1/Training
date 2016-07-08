package com.endava.training.examples;

/**
 * Created by ivamesu on 7/8/2016.
 */
public class ExtendedSimple extends Simple {

    int j;
    ExtendedSimple(){}

    ExtendedSimple(int i){
        super(i);
        System.out.println("Hello from constructor with 1 args");
    }
    ExtendedSimple(int i, int j){
        super(i);
        this.j = j;
        System.out.println("Hello from constructor with 2 args");
    }
}
