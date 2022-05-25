package com.syntax.HW24;

public class Computer {
    String name;
    Computer(String name){
        this.name=name;

    }
    void operatingSystem(){
        System.out.println(name+" supported operating system is Wndows");
    }
    void screenResolution(){
        System.out.println(name+" screen resolution is 1920x1080");
    }
    void commonlyUsed(){
        System.out.println(name+" mostly used in the industry");
    }

}
class Apple extends Computer{
    Apple(String name){
        super(name);
    }
    @Override
    void  commonlyUsed(){
        System.out.println(name+" Not commonly used in the industry");
    }
    @Override
    void operatingSystem(){
        System.out.println(name+" Apple operating system is OS X");
    }
    void antiVirus(){
        System.out.println("Apple computers dont get virus");

    }
}
class Lenovo extends Computer{
    Lenovo(String name){
        super(name);
    }
    @Override
    void commonlyUsed(){
        System.out.println("Lenovo commonly used for gaming");

    }
    void flexibility(){
        System.out.println("Flexibility of operating system and simplified in its most practical way");
    }
}
class HP extends Computer{
    HP(String name){
        super(name);

    }
    @Override
    void commonlyUsed(){
        System.out.println("Mostly used in hospitals");
    }
    void price(){
        System.out.println("Has reasonable price");
    }
}
class Dell extends Computer{
    Dell (String name) {
        super(name);
    }
        void atItBest(){
            System.out.println("Best computer and most commonly used "+name);
        }
    }

