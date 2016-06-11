package com.goit.modul6.part1;


public class Rectangle extends Figure {
    private double a;
    private double b;

    Rectangle(double a, double b){
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString(){
        return "a=" + this.a + " b=" + this.b;
    }

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
        if ((a < 0) || (b < 0)) {
            throw new IllegalArgumentException("[Rectangle] Value of 'a' or 'b' is mistake: a=" + a + " b=" + b);
        }
        return a*b;
    }

}
