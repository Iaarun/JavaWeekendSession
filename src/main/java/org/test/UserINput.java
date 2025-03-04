package org.test;

import java.util.Scanner;

public class UserINput {
    public static void main(String[] args) {
        UserINput in = new UserINput();
        in.userInput();
    }

    public void userInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String data");
         String str= sc.nextLine();
        System.out.println(str);
        System.out.println("Enter number input");
        int num= sc.nextInt();
        System.out.println(num);

        System.out.println("Enter character data");
        char ch= sc.next().charAt(0);
        System.out.println(ch);

    }
}
