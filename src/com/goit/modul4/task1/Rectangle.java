package com.goit.modul4.task1;

/**
 * Created by Den on 31.05.2016.
 */
public class Rectangle extends Figure {
    private double a;
    private double b;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public String getName(){
        return "Rectangle";
    }

    public double getArea(){
        return a*b;
    }
}
