package org.test;
/*
local
instance
static
 */
public class Variablestest {

    int num1;
    static String name;

    public static void main(String[] args) {

        // datatype variable_name = value;

        int num;
        num = 10;
      //  System.out.println(num);

        Variablestest t1 = new Variablestest();
        Variablestest t2 = new Variablestest();
             t1.num1=15;
             t2.num1=20;
        System.out.println(t1.num1);
        System.out.println(t2.num1);

        t1.name= "Selenium";
        t2.name= "java";
        System.out.println(t1.name);
        System.out.println(t2.name);
    }
}
