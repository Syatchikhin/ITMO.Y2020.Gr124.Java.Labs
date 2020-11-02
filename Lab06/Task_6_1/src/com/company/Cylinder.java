package com.company;

public class Cylinder extends SolidOfRevolution{
    double height;

    Cylinder(int rad , int h ) {
        super(rad);
        this.height = h;
    }

   // @Override
    double getVolume(){
        return 3.14 * Math.pow(radius,2) * height;
    }


}
