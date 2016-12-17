package com.goit.modul6.part1;

import java.io.IOException;

public class DegreeConverter {

    public static final double FREEZING_POINT = 32.0;
    public static final double DISTANCE_POINT = 1.8;

    public static double calsiusToFahrenheit(double celsius){
return (celsius * DISTANCE_POINT) + FREEZING_POINT;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - FREEZING_POINT) / DISTANCE_POINT;
    }

    public static void main (String[] args) {
        DegreeConverter degreeConverter = new DegreeConverter();

        try{
        double celsius = 20;
        System.out.println(celsius + "'C = " + degreeConverter.calsiusToFahrenheit(celsius) + "'F");

        double fahrenheit = 212;
        System.out.println(fahrenheit + "'F = " + degreeConverter.fahrenheitToCelsius(fahrenheit) + "'C");//Double.valueOf("212r")
        } catch (Exception e){
            System.out.println(e.fillInStackTrace());
        }

    }
}
