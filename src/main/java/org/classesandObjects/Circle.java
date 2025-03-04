package org.classesandObjects;

public class Circle {
    public static void main(String[] args) {
      double circlearea=   area(5);

        System.out.println(circlearea);
        System.out.println(circlearea*2);
    }

    public static double area(double radius){
        double area = Math.PI*radius*radius;
       return area;
    }

    /*
    private
    default
    protected
    public
     */
}
