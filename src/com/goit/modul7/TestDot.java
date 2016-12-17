package com.goit.modul7;


public class TestDot {
    // Golden hammer Solution: мыслить ООП, разбить на два класса
    public static void main (String[] args) {
        Dot dot1 = new Dot(2, 3);
        Dot dot2 = new Dot(3, 4);

        System.out.println("x1=" + dot1.getX() + " y1=" + dot1.getY());
        System.out.println("x2=" + dot2.getX() + " y2=" + dot2.getY());

        System.out.println("d=" + dot1.distance(dot2));


    }
}
