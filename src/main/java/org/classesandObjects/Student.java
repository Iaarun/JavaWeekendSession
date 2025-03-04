package org.classesandObjects;

public class Student {
   int id;
   String name;
   String[] courses;

    public static void main(String[] args) {
        Student st = new Student();
        st.getName();
        st.getName("Amit");
        getName("Rohit");
        Student.getName("");
    }
    /*
    accessmodifier static returntype name(){
    }
     */

    public void getName(){
        Student student = new Student();
        student.name = "Abhishek";
        System.out.println(student.name);
    }

    public static void getName(String name){
        System.out.println(name);
    }






}


