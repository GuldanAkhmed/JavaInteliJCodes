package com.syntax.class26.class24;

 abstract class File {
         void open(){
             System.out.println("Editing a class");
         }
         void edit(){
             System.out.println("closing the file");
         }
     void close() {
         System.out.println("closing the file");
     }
}
  class JavaFile extends File{
     @Override
      void open(){
         System.out.println("Use intelij to open java files");
     }

}
class WorldFile extends File{
     @Override
    void open(){
         System.out.println("Use microsoft word to open this file");
     }
}
class PDFFile extends File {
    @Override
    void open() {
        System.out.println("Use Adobe reader to open the file");


    }

}

public class Task2 {
    public static void main(String[] args) {
        File[] files={new JavaFile(),new PDFFile(),new  WorldFile()};
        for (int i=0; i<files.length; i++){
            files[i].open();
            files[i].edit();
            files[i].close();
        }
    }

}