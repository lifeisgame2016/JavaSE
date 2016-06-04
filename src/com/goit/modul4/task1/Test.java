package com.goit.modul4.task1;

/**
 * Created by Den on 03.06.2016.
 */
public class Test {
    public static void main(String[] args){
        Figure figure = new Circle(4);
        System.out.println("Circle: " + figure.toString() + " S=" + figure.getArea());

        figure = new Rectangle(3, 4);
        System.out.println("Rectangle: " + figure.toString() + " S=" + figure.getArea());

        figure = new Triangle(5,6);;
        System.out.println("Triangle: " + figure.toString() + " S=" + figure.getArea());

    }
}
