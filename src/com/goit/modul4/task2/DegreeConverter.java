package com.goit.modul4.task2;

public class DegreeConverter {

    public static double calsiusToFahrenheit(double celsius){
        double fahrenheit;
        fahrenheit = (celsius * 1.8) + 32;
        return fahrenheit;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius;
        celsius = (fahrenheit - 32) / 1.8;
        return celsius;
    }

    public static void main (String[] args) {
        DegreeConverter degreeConverter = new DegreeConverter();

        double celsius = 20;
        System.out.println(celsius + "'C = " + degreeConverter.calsiusToFahrenheit(celsius) + "'F");

        double fahrenheit = 212;
        System.out.println(fahrenheit + "'F = " + degreeConverter.fahrenheitToCelsius(fahrenheit) + "'C");

    }
}
