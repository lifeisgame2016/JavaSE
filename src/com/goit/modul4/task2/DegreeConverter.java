package com.goit.modul4.task2;

public class DegreeConverter {
    private int celsius;
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

    public double calsiusToFahrenheit(){
        double fahrenheit;
        fahrenheit = (this.celsius * 1.8) + 32;
        return fahrenheit;
    }

    public double fahrenheitToCelsius() {
        double celsius;
        celsius = (this.fahrenheit - 32) / 1.8;
        return celsius;
    }

    public static void main (String[] args) {
        DegreeConverter degreeConverter = new DegreeConverter();
        try {
            degreeConverter.setCelsius(20);
            System.out.println(degreeConverter.getCelsius() + "'C = " + degreeConverter.calsiusToFahrenheit() + "'F");

            degreeConverter.setFahrenheit(212);
            System.out.println(degreeConverter.getFahrenheit() + "'F = " + degreeConverter.fahrenheitToCelsius() + "'C");
        } catch(IllegalArgumentException e){
            System.out.println("You entered the frong number of argument");
        } catch (Exception e){
            System.out.println("Thre was stil some exception");
        }
    }
}
