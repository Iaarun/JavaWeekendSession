package org.polymorphismDemo;

import java.util.Scanner;

public class Calculator {

    public void  add(int a, int b){
        System.out.println(a+b);
    }

   public void add (double a, double b){
       System.out.println(a+b);
   }
    public void add (double a, double b, int c){
        System.out.println(a+b+c);
    }

    public static void add (int a, double b){
        System.out.println(a+b);
    }
    public  static void add (String  b, int a){
        System.out.println(a+b);
    }


    public static void main(String[] args) {
           Calculator calc = new Calculator();
           calc.add(10,20,30);
    }

    public void add(int... a){
       int sum=0;
        for(int i:a){
            sum +=i;
        }
        System.out.println(sum);
    }

}
