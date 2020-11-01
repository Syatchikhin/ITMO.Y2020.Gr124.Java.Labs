package com.company;

public class Kelvin extends Celcius{

    //double kelvinDegrees;

    Kelvin(double kdeg) {
        super(kdeg);
    }


    double getTemperature(){
        return degrees + 273.15 ;

    }



}
