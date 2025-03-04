package org.test;

import java.util.Scanner;

public class DecisionMaking {
    public static void main(String[] args) {
        DecisionMaking dm = new DecisionMaking();
        dm.switchcase();
    }

    public void ifstatement(){
        /*
if (condition){
  statement
}
 */

        int i=10;

        if (i<15){
            System.out.println("number is less than 15");
        }else{
            System.out.println("number is greater than 15");
        }
    }


    public void ladderIf(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Check Signal");
       String trafficsignal= sc.nextLine();

       if(trafficsignal.equalsIgnoreCase("red")){
           System.out.println("STOP");
       } else if (trafficsignal.equalsIgnoreCase("yellow")) {
           System.out.println("preparetostop");
       } else if (trafficsignal.equalsIgnoreCase("green")) {
           System.out.println("GO");
       } else{
           System.out.println("Incorrect Input");
       }

    }

    //switch case
    public void switchcase(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Check Signal");
        String trafficsignal= sc.nextLine();

        switch (trafficsignal.toLowerCase()){
            case "red":
                System.out.println("STOP");
                break;
            case "yellow":
                System.out.println("preparetostop/go");
                break;

            case "green":
                System.out.println("GO");
                break;

            default:
                System.out.println("Incorrect Input");
                break;

        }
    }

}
