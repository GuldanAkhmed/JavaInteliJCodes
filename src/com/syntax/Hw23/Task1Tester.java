package com.syntax.Hw23;

public class Task1Tester {
    public static void main(String[] args) {
        Student syntaxStudent = new SyntaxStudent();
        Student schoolStudent = new SchoolStudent();
        Student[] students = {new SyntaxStudent(), new SchoolStudent(), new CollegeStudent()};

        for (Student student:students){
         student.study();
         student.doHomeWork();
         student.practice();
        }
    }
}
