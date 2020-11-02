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

//class Ball extends SolidOfRevolution { // конкретный класс
//
//    @Override
//    public double getVolume() {
//        return Math.PI * Math.pow(radius, 3) * 4 / 3;
//    }
//
//    public Ball(double radius) {
//        super(radius);
//    }
//}
