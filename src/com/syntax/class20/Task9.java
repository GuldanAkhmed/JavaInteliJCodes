package com.syntax.class20;

public class Task9 {
    public static void main(String[] args) {
        MathTeacher mathTeacher=new MathTeacher();
        mathTeacher.name="Teyfur";
        mathTeacher.teachCalculus();
    }
}
     class TeacherA {
        String name;
        int age;
        double weight;
        void printName(){
            System.out.println(name);
        }

    }
    class MathTeacher extends TeacherA {
        boolean canTeachTrigonometery=true;
        void teachCalculus(){
            System.out.println("Teaching Calculus");
        }
    }
    class ChemistryTeacher extends  TeacherA{
        boolean canTeachChemicals=true;
        void teachOrganicChemistry(){
            System.out.println("Teaching OrganicChemistry");
        }
    }

    class PianoTeacher extends  TeacherA{
        boolean canRideBike=true;
        void teachPiano(){
            System.out.println("Teaching Piano");
        }
    }


