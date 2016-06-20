package com.goit.modul7;

public class DegreeConverter {
    public static final double WATER_FREEZES = 32.0;
    public static final double POINTS_DISTANCE = 1.8;

    public static double calsiusToFahrenheit(double celsius){
        return (celsius * POINTS_DISTANCE) + WATER_FREEZES; //Magic numbers Solution: вынести в переменные
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - WATER_FREEZES) / POINTS_DISTANCE; //Magic numbers Solution: вынести в переменные
    }

    // Golden hammer Solution: Разбить на два класса DegreeConverter и Runner
    public static void main (String[] args) {
        DegreeConverter degreeConverter = new DegreeConverter();

        try{
        double celsius = 20; //Golden hammer Solution: вводить с клавиатуры
        System.out.println(celsius + "'C = " + degreeConverter.calsiusToFahrenheit(celsius) + "'F");

        double fahrenheit = 212; //Golden hammer Solution: вводить с клавиатуры
        System.out.println(fahrenheit + "'F = " + degreeConverter.fahrenheitToCelsius(fahrenheit) + "'C");//Double.valueOf("212r")
        } catch (Exception e){
            System.out.println(e.fillInStackTrace());
        }

    }
}
