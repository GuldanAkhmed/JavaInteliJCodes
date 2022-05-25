package com.syntax.HW24;

public class ComputerTester {
    public static void main(String[] args) {
        Computer[] computers={new Apple("Apple "), new Lenovo("Lenovo"), new HP("HP"), new Dell("Dell")};
        for(Computer comp:computers){
            comp.operatingSystem();
            comp.screenResolution();
            comp.commonlyUsed();

            }
        }
    }

