package com.syntax.review10;

public class Bike {
    int maxSpeed=100;

}
class HondaBikes extends Bike{
    int maxSpeed=150;

    void printMaxSpeed(){
        int maxSpeed=200;
        System.out.println(maxSpeed);
        System.out.println(this.maxSpeed);
        System.out.println(super.maxSpeed);
    }
}
class Test234{
    public static void main(String[] args) {
        HondaBikes hondaBikes=new HondaBikes();
        hondaBikes.printMaxSpeed();
    }
}