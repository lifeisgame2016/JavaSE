package com.goit.modul6.part1;

/**
 * Created by Den on 03.06.2016.
 */
public class Test {
    public static void main(String[] args){
        Figure figure = new Circle(-4);
        try {
            System.out.println("Circle: " + figure.toString() + " S=" + figure.getArea());
        } catch (IllegalArgumentException e){
            System.out.println("Argument was passed with a negative value.");
            System.out.println(e.getMessage());
        }

        figure = new Rectangle(3, 4);
        try {
            System.out.println("Rectangle: " + figure.toString() + " S=" + figure.getArea());
        } catch (IllegalArgumentException e){
            System.out.println("Argument was passed with a negative value.");
            System.out.println(e.getMessage());
        }

        figure = new Triangle(5,6);
        try {
            System.out.println("Triangle: " + figure.toString() + " S=" + figure.getArea());
        } catch (IllegalArgumentException e){
            System.out.println("Argument was passed with a negative value.");
            System.out.println(e.getMessage());
        }

    }
}
