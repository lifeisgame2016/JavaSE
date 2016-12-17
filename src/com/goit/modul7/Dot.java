package com.goit.modul7;

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
        if (dot == null){
            throw new NullPointerException("Dot must not be null");
        }
        double d;
        d = Math.sqrt(Math.pow((dot.x - this.x), 2) + Math.pow((dot.y - this.y), 2));
        return d;
    }

}
