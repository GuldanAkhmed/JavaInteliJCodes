package com.syntax.HW17;

public class SyntaxStudents {
   String name;
   String stId;
   static int  numberOfStudents=181;

    public static void main(String[] args) {
      SyntaxStudents syntaxObject=new SyntaxStudents();
      syntaxObject.name="Gulden";
      syntaxObject.stId="444";
        System.out.println(syntaxObject.name);
        System.out.println(syntaxObject.stId);
        System.out.println(SyntaxStudents.numberOfStudents);

        SyntaxStudents syntaxObject1=new SyntaxStudents();
        syntaxObject1.name="Gulnar";
        syntaxObject1.stId="555";
        System.out.println(syntaxObject1.name);
        System.out.println(syntaxObject1.stId);
        System.out.println(SyntaxStudents.numberOfStudents);

        SyntaxStudents syntaxObject2=new SyntaxStudents();
        syntaxObject2.name="Nilufer";
        syntaxObject2.stId="888";
        System.out.println(syntaxObject2.name);
        System.out.println(syntaxObject2.stId);
        System.out.println(SyntaxStudents.numberOfStudents);

    }




}
