package com.syntax.class21;



public class Shape {
    double radius;
    Shape(double radius){
        this.radius=radius;
    }
}
class Circle extends Shape{
    Circle(double radius){
        super(radius);

    }
    void calculate(){
        double area=radius * radius * Math. PI;
        System.out.println(area);
    }
}

class ShapeTester {
    public static void main(String[] args) {
        Circle getArea=new Circle(4.0);
        getArea.calculate();
    }
}







