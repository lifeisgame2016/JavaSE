package com.goit.modul4.task2;

public class DegreeConverter {

    public static double calsiusToFahrenheit(double celsius){
        return (celsius * 1.8) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) / 1.8;
    }

    public static void main (String[] args) {
        DegreeConverter degreeConverter = new DegreeConverter();

        double celsius = 20;
        System.out.println(celsius + "'C = " + degreeConverter.calsiusToFahrenheit(celsius) + "'F");

        double fahrenheit = 212;
        System.out.println(fahrenheit + "'F = " + degreeConverter.fahrenheitToCelsius(fahrenheit) + "'C");

    }
}
