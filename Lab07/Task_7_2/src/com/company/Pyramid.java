package com.company;

public class Pyramid extends Shape {
   private double area;
   private double height;

   // @Override
    public Pyramid(double s, double h){
        //super( volume);
        //this.volume = vol;
        this.area = s;
        this.height = h;
    }

    public void Pyramid(){
    }

    @Override
    public double getVolume(){
        return (area * height ) /3;
    }

}











//package com.company;
//
//public class Pyramid implements Shape {
//
//    double area;
//    int height;
//
//    Pyramid(double s, int h){
//        this.area = s;
//        this.height = h;
//    }
//
//    @Override
//    public double getVolume(){
//        return (area * height ) /3;
//    }
//
//}