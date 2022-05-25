package com.syntax.class19;

public class Panda {

    String name= "Poe";
    String breed= "Red panda";
    String color= "red";
    double height= 2.2;
    int age= 12;
    double weight =30.0;

    Panda (String pandaName,String pandaBreed, String pandaColor, double pandaHeight,int pandAge, double pandaWeight ) {
        name= pandaName;
        breed = pandaBreed;
        color = pandaColor;
        height = pandaHeight;
        age= pandAge;
        weight = pandaWeight;

    }

    Panda (String pandaName) {
        name= pandaName;

    }

    public Panda(String mannyPanda, String black_panda) {
    }


    void printInfo () {
        System.out.println(name + breed + color + height + age + weight );
    }

}




