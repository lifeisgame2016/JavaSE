package com.goit.modul4.task1;


public class Triangle extends Figure{
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
        try {
            this.b = b;
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public String getName(){
        return "Triangle";
    }

    public double getArea(){
        return 0.5*a*b;
    }
}
