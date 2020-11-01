package com.company;

public class Fahrenheit extends Celcius {


        //double fahrenheitDegrees;

        Fahrenheit(double fdeg) {
            super(fdeg);
        }


        double getTemperature(){
            return 1.8 * degrees + 32 ;

        }

    }

