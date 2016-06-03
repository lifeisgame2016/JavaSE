package com.goit.modul4.task3;

public class Dot {
    private int x;
    private int y;

    Dot(int x, int y){
        this.x = x;
        this.y = y;
    }

    Dot(){
        this.x = 0;
        this.y = 0;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void distance(Dot dot){
        try {
            double d;
            d = Math.sqrt(Math.pow((dot.x - this.x), 2) + Math.pow((dot.y - this.y), 2));
            System.out.println("x1=" + this.x + " y1=" + this.y);
            System.out.println("x2=" + dot.x + " y2=" + dot.y);
            System.out.println("d=" + d);
        } catch (ArithmeticException e){
            System.out.println("Arithmetical mistake");
        }
    }

    public static void main (String[] args) {
        try {
            Dot dot1 = new Dot(2, 3);
            Dot dot2 = new Dot(3, 4);

            dot1.distance(dot2);
        } catch (Exception e){
            System.out.println("Exception");
            System.out.println(e.getMessage());
        }
    }
}
