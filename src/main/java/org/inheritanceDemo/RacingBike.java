package org.inheritanceDemo;

public class RacingBike extends Bike {
    int seatHeight;

    public RacingBike(int gear, int speed, int engine_cc, int seatHeight) {
        super(gear, speed, engine_cc);
        this.seatHeight=seatHeight;
    }

    @Override
    public String toString() {
        return super.toString()+
                "\nSeat height is: "+seatHeight;
    }
}
