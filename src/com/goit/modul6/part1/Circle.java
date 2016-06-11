package com.goit.modul6.part1;

/**
 * Created by Den on 31.05.2016.
 */
public class Circle extends Figure {

    private double r;

    Circle(double r){
        this.r = r;
    }

    @Override
    public String toString() {
        return "r=" + this.r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public String getName(){
        return "Circle";
    }

    public double getArea(){
        if (r < 0) {
            throw new IllegalArgumentException("[Circle] Value is mistaken: r=" + r);
        }
        return Math.PI * r * r;
    }
}
