package com.company;

public class Main {
    public static void main(String[] args) {

        double temp = 15;

        Celcius celcius = new Celcius ( temp);
        System.out.println("in Celcius");
        System.out.println("is: " + celcius.getTemperature());

        Kelvin kelvin = new Kelvin ( temp);
        System.out.println("in Kelvin");
        System.out.println("is: " + kelvin.getTemperature());

        Fahrenheit fahrenheit = new Fahrenheit ( temp);
        System.out.println("in Fahrenheit");
        System.out.println("is: " + fahrenheit.getTemperature());

    }
}
