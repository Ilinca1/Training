package com.endava.training.examples;

/**
 * Created by ivamesu on 7/8/2016.
 */
public class B extends A {
    void f(){
        System.out.println("Hello from B");
    }
    void f(int i, int j){
        System.out.println("Hello from B - 2 arg: " + i + " " + j);
    }

    void f(int i){
        System.out.println("Hello from B - 1 arg: " + i);
    }
}
