package com.syntax.Hw23;

class Student{
    void study(){
        System.out.println("Student must be study to pass");
    }
    void doHomeWork(){
        System.out.println("Student must do homeworks");
    }
    void practice(){
        System.out.println("Student must to practice");
    }

}

class SyntaxStudent extends Student{
    void study(){
        System.out.println("Syntax student must study 25 hours a week");
    }
    void doHomeWork(){
        System.out.println("Syntax students must solve repls");
    }
    @Override
    void practice(){
        System.out.println("Syntax students must do their own research");
    }
}
class CollegeStudent extends Student{
    @Override
    void doHomeWork(){
        System.out.println("College students can skip some of the homeworks");
    }
}
class SchoolStudent extends Student{

}