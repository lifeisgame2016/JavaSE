package com.goit.modul4.task1;

/**
 * Created by Den on 03.06.2016.
 */
public class Test {
    public static void main(String[] args){
        Figure circle = new Circle(4);
        System.out.println("Circle: " + circle.toString() + " S=" + circle.getArea());

        Figure rectangle = new Rectangle(3,4);
        System.out.println("Rectangle: " + rectangle.toString() + " S=" + rectangle.getArea());

        Figure triangle = new Triangle(5,6);;
        System.out.println("Triangle: " + triangle.toString() + " S=" + triangle.getArea());

    }
}
