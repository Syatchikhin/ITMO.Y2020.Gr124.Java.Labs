package com.company;

public class Ball extends SolidOfRevolution{
    Ball(int rad) {
        super(rad);
    }
    //this.radius = rad;

    @Override
    public double getVolume(){
        return  (4 * 3.14 * Math.pow(radius,3))/3;
    }
}