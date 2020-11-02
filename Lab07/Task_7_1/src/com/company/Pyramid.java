package com.company;

public class Pyramid implements Shape {

    double area;
    int height;

    Pyramid(double s, int h){
        this.area = s;
        this.height = h;
    }

    @Override
    public double getVolume(){
        return (area * height ) /3;
    }

}