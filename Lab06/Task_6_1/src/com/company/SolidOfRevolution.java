package com.company;

abstract class SolidOfRevolution extends Shape {
    double radius;

    SolidOfRevolution(int rad) {
        super(rad);

        this.radius = rad;
    }

    double getRadius(){
        return radius;
    }


}

