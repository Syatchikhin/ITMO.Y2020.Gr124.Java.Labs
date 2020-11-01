package com.company;

public class Shape {
    double width;
    double height;
    double volume;

    Shape (double vol ){
        volume = vol;
        System.out.println("This is");
    }

    Shape(int a, int b){
        this.width = a;
        this.height = b;
        System.out.println("This is");

    }

    double getVolume(){
        return volume;

    }

}
