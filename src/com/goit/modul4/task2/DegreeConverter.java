package com.goit.modul4.task2;

public class DegreeConverter {
    private  int celsius;
    private int fahrenheit;

    public int getCelsius() {
        return celsius;
    }

    public void setCelsius(int celsius) {
        this.celsius = celsius;
    }

    public int getFahrenheit() {
        return fahrenheit;
    }

    public void setFahrenheit(int fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

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

        degreeConverter.setCelsius(20);
        System.out.println(degreeConverter.getCelsius() + "'C = " + degreeConverter.calsiusToFahrenheit(degreeConverter.getCelsius()) + "'F");

        degreeConverter.setFahrenheit(212);
        System.out.println(degreeConverter.getFahrenheit() + "'F = " + degreeConverter.fahrenheitToCelsius(degreeConverter.getFahrenheit()) + "'C");

    }
}
