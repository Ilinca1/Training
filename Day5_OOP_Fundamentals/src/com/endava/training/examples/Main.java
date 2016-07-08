package com.endava.training.examples;

/**
 * Created by ivamesu on 7/8/2016.
 */
public class Main {
    public static void main(String[] args) {
        Simple simple = new Simple(1);
        ExtendedSimple extendedSimple1 = new ExtendedSimple(1);
        ExtendedSimple extendedSimple2 = new ExtendedSimple(1,2);

        A a1 = new B();
        a1.f(); //from B
        a1.f(1);
        a1.f(1,2);
        B b = new C();
        b.f(); //from C
        b.f(3);
        b.f(3,4);
        A a2 = new C();
        a2.f(); //from C
        a2.f(1);
        a2.f(2,3);
    }
}
