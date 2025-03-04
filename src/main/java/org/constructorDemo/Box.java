package org.constructorDemo;

public class Box {
    int length;
    int width;
    int height;

   private Box(){
        System.out.println("DataBase Connection");

    }


   public Box(int length, int width, int height){
       this();
        System.out.println("Parameterised Constructor");
        this.length=length;
       this.width=width;
        this.height=height;
    }

    public Box(int length, int width){
        this(12,52,30);
        System.out.println("Parameterised Constructor");
        this.length=length;
        this.width=width;
        this.height=height;
    }



    public static void main(String[] args) {

        Box box = new Box(20,20,20);
        System.out.println(box.length);
        System.out.println(box.width);
        System.out.println(box.height);
    }
}
