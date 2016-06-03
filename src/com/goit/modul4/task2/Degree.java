package com.goit.modul4.task2;

public class Degree {
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

    public void calsiusToFahrenheit(){
        double fahrenheit;
        fahrenheit = (this.celsius * 1.8) + 32;
        System.out.println(this.celsius + "'C = " + fahrenheit + "'F");

    }

    public void fahrenheitToCelsius() {
        double celsius;
        celsius = (this.fahrenheit - 32) / 1.8;
        System.out.println(this.fahrenheit + "'F = " + celsius + "'C");
    }

    public static void main (String[] args) {
        Degree degree = new Degree();
        try {
            degree.setCelsius(20);
            degree.calsiusToFahrenheit();

            degree.setFahrenheit(212);
            degree.fahrenheitToCelsius();
        } catch(IllegalArgumentException e){
            System.out.println("You entered the frong number of argument");
        } catch (Exception e){
            System.out.println("Thre was stil some exception");
        }
    }
}
