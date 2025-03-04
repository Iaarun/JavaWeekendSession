package org.test;

import org.constructorDemo.Box;
import org.testpackage1.A;


public class C extends A {
    public static void main(String[] args) {
        A objA = new A();
        objA.test4();

        C objC = new C();
        objC.test3();
        objC.test4();

 // Box box = new Box(30,50,61);
    }
}
