package com.syntax.class25;

public abstract class SmartWatch {
    //we can have instance variables in an abstract class

    private int RAM;
    protected int ROM;
    double displaySize;
    public String make;
    static boolean showTime=true;

    public SmartWatch(int RAM, int ROM,double displaySize,String make){
        this.RAM=RAM;
        this.ROM=ROM;
        this.displaySize=displaySize;
        this.make=make;

    }
    //1) accsess modifiers
    //2)non-accsess modifiers
    //3)return type
    //4) method name
    public abstract void showHealthTips();
    private void updateOS(){
        System.out.println("Update the OS");
    }
    public void checkOSUpdate(){
        System.out.println("Checking if update is available");
    }
    private void downloadUpdate(){
        System.out.println("downloading the update");
    }
   private void installUpdate(){
       System.out.println("Installing the update");
   }
   static void displayTime(){
       System.out.println("Displaying time");
   }

}
class AppleWatch extends SmartWatch{
    public AppleWatch(int RAM,int ROM,double displaySize,String make){
        super(RAM,ROM, displaySize,make);
    }

    @Override
    public void showHealthTips() {

    }
}