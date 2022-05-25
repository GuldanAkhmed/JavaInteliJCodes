package com.syntax.hw19;

public class TeacherTester {
    public static void main(String[] args) {
        Teacher teacher=new Teacher("Asghar", 27); //public-works in any project any package
        //Teacher teacher1=new Teacher("Asghar",27,180); private-works within same class
        Teacher teacher2=new Teacher("Asghar",27,180,'M'); //protected-works inside same package and different class
        Teacher teacher3=new Teacher("ASghar",27,180,'M',5.7); //default-works same project in different packages

    }
}
