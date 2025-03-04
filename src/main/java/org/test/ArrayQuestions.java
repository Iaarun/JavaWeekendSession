package org.test;

public class ArrayQuestions {

    public static void main(String[] args) {
        ArrayQuestions aq = new ArrayQuestions();
        aq.maxOfArray();
    }

    public void sumofArray(){
        int [] arr = {12,15,36};
        int sum=0;
        for(int i=0; i<=arr.length-1; i++){
            sum = sum+arr[i];
        }

        System.out.println(sum);
    }

    public void maxOfArray(){
        int [] arr = {12,15, 13,36};
        int max=arr[0];
        for(int i=1; i<=arr.length-1; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }

        System.out.println(max);
    }
}
