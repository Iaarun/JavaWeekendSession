package org.inheritanceDemo;

public class Bike {
    public int gear;
    public int speed;
    public int engine_cc;

    public Bike(int gear, int speed, int engine_cc) {
        this.gear = gear;
        this.speed = speed;
        this.engine_cc=engine_cc;
    }

   public void applyBrake(int decrement){
        speed -= decrement;
     //   speed = speed-decrement;
   }

   public void accelerateBike(int increment){
        speed += increment;
   }

    @Override
    public String toString() {
        return ("No f gears are: "+gear+"\nSpeed of the bicycle is: "+speed+"\nEngine Capacity is:"+engine_cc);
    }

}
