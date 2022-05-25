package com.syntax.class23;

class Degree {
    void getPrerequisite(){
        System.out.println("To get a degree you need high school diploma");
    }

}
class Bachelors extends Degree {

}class Masters extends Degree{
    @Override
    void getPrerequisite(){
        System.out.println("To get a master degree you need bachelors");
}
}
public class Task4 {
    public static void main(String[] args) {

        Masters masters = new Masters();
        masters.getPrerequisite();
        Bachelors bachelors = new Bachelors();
        bachelors.getPrerequisite();
    }

}


