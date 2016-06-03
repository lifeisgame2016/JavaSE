package com.goit.modul4.task1;

/**
 * Created by Den on 03.06.2016.
 */
public class Test {
    public static void main(String[] args){
        Circle circle = new Circle();
        circle.setR(4);
        System.out.println("Circle: r=" + circle.getR() + " S=" + circle.getArea());

        Rectangle rectangle = new Rectangle();
        rectangle.setA(5);
        rectangle.setB(7);
        System.out.println("Rectangle: a=" + rectangle.getA() + " b=" + rectangle.getB() + " S=" + rectangle.getArea());

        Triangle triangle = new Triangle();
        triangle.setA(6);
        triangle.setB(8);
        System.out.println("Triangle: a=" + triangle.getA() + " b=" + triangle.getB() + " S=" + triangle.getArea());

    }
}
