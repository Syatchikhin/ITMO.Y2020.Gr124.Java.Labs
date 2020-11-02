package com.company;

public class Cylinder extends SolidOfRevolution{
    double height;

    Cylinder(int rad , int h ) {
        super(rad);
        this.height = h;
        this.volume = 3.14 * Math.pow(radius,2) * height;
    }

     @Override
 public double getVolume(){
        return 3.14 * Math.pow(radius,2) * height;
    }


}

//class Cylinder extends SolidOfRevolution { // конкретный класс
//
//    private double height;
//
//    public Cylinder(double radius, double height) {
//        super(radius);
//        this.height = height;
//    }
//
//    @Override
//    public double getVolume() {
//        return Math.PI * radius * radius * height;
//    }
//}