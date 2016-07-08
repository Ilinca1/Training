package com.endava.training.examples;

/**
 * Created by ivamesu on 7/8/2016.
 */
public class C extends B{
    void f(){
        System.out.println("Hello from C");
    }
    void f(int i, int j){
        System.out.println("Hello from C- 2 arg: " + i + " " + j);
    }

    void f(int i){
        System.out.println("Hello from C - 1 arg: " + i);
    }
}
