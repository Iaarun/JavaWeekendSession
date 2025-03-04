package org.test;

public class StringDemo {
    public static void main(String[] args) {
        StringDemo sd = new StringDemo();
        sd.stringFunctions();
    }

    public void stringObjects(){
        // string datatype  variableName= charactersequence

        String dummy = "Selenium";
        String dummy1 = "Selenium";
        String demo = new String("Java");
        String demo1 = new String("Java");

        if (demo == demo1){
            System.out.println("String is the reference");
        }else{
            System.out.println("New value is there");
        }
    }


    public void immutableString(){
        String course = "Selenium";
        System.out.println(course);
     ///   course+" Java";
      course=  course.concat( "Java");
        System.out.println(course);

        //StringBuffer
        //StringBuilder
        StringBuffer s1 = new StringBuffer("Test");
           s1.append(" Python");
        System.out.println(s1);

        StringBuilder sb = new StringBuilder(course);
        System.out.println(sb);

    }

    public void stringFunctions(){
        String course = "I want to learn Selenium";
        String course1 = "I want to learn selenium";
        //convert to lowercase
        System.out.println(course.toLowerCase());
        //convert to uppercase
        System.out.println(course.toUpperCase());
        //find length of String
        System.out.println(course.length());
        //compare String values
        System.out.println(course.equals(course1));
        System.out.println(course.equalsIgnoreCase(course1));

        //return character index
        System.out.println(course.indexOf("a"));
        System.out.println(course.lastIndexOf("a"));

        System.out.println(course.trim());

        //get substring from a string
        System.out.println(course.substring(2));
        System.out.println(course.substring(2,6));

        //starts with and ends with
        System.out.println(course.startsWith("w"));

       String email= "abcxyz@gmaiil.com";
        System.out.println(email.replace("gmail", "hotmail"));

        char[] chararr=    email.toCharArray();

        if (email.contains("@gmail")){
            System.out.println(email);
        }else {
            System.out.println("No Gmail Id");
        }


    }
}
