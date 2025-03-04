package org.test;

import java.util.Scanner;

public class FlowControl {
    public static void main(String[] args) {
        FlowControl fc = new FlowControl();
                fc.forloop();
    }

    public void dowhileloop(){
         int num = 1;
         do{
             System.out.println(num);
         }while(num>5);

    }

    public void forloop(){
        /*
         for (initialization; condition; increment/decrement){
                   #code
            }
         */
      Scanner sc= new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
       for (int count =1; count<=10; ++count){
           System.out.println(num*count);
       }

    }

    public void getFactorial(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        int fact=1;
        for(int count=num; count>=1; count--){
            fact = fact*count;
        }

        System.out.println(fact);
    }


    public void whileloop(){
        /*
           initialization;
           while(condition){
              #code
              increment/decrement;
           }
         */
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        int fact=1;

        int count=1;
        while(count<=num){
            fact = fact*count;
            count++;
        }
        System.out.println(fact);
    }

   public void breakStatement(){
        for(int num=1; num<15; num++){
            if(num==10){
                break;
            }
            System.out.println(num);
        }
   }

    public void continueStatement(){
        for(int num=1; num<15; num++){
            if(num==10){
                continue;
            }
            System.out.println(num);
        }
    }
}
