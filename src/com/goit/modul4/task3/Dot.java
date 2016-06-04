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

    public double distance(Dot dot){
        double d;
        d = Math.sqrt(Math.pow((dot.x - this.x), 2) + Math.pow((dot.y - this.y), 2));
        return d;
    }

    public static void main (String[] args) {
        Dot dot1 = new Dot(2, 3);
        Dot dot2 = new Dot(3, 4);

        System.out.println("x1=" + dot1.x + " y1=" + dot1.y);
        System.out.println("x2=" + dot2.x + " y2=" + dot2.y);
        System.out.println("d=" + dot1.distance(dot2));

    }
}
