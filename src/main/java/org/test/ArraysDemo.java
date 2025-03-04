package org.test;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysDemo {
    public static void main(String[] args) {
        ArraysDemo ad = new ArraysDemo();
        ad.twoDimensionalArray();
    }

    public void singleDimension(){
        int [] arr;
         arr= new int[6];

         arr[0]=15;
         arr[1]=25;
         arr[2]=40;
         arr[4]=55;
        int num=  arr[arr.length-1];
        System.out.println(num);
    }

    public void userInputArray(){
        System.out.println("Enter size of array");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        System.out.println("Enter "+size+" values in array");
        int [] arr = new int [size];
        for(int i=0; i<=arr.length-1;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println(Arrays.toString(arr));

        for(int i=0;i<=arr.length-1; i++){
            System.out.println(arr[i]);
        }

        System.out.println("enhance for loop ");

      for(int a:arr){
          System.out.println(a);
      }
    }


    public void twoDimensionalArray(){
     int [][] arr = new int[3][];
        Scanner sc = new Scanner(System.in);

     for(int i=0; i<arr.length-1; i++){
         for(int j=0; j<=arr[i].length-1; j++){
             arr[i][j]=sc.nextInt();
         }
     }


        for(int i=0; i<=arr.length-1; i++){
            for(int j=0; j<=arr[i].length-1; j++){
                System.out.print( arr[i][j]);
            }
            System.out.println();
        }
    }
}
