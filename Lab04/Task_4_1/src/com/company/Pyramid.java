package com.company;

public class Pyramid extends Shape {

    double area;
    int height;

    Pyramid(double s, int h){
        super (h);
        this.area = s;
        this.height = h;
    }

       double getVolume(){
          return (area * height ) /3;
       }

      double getArea(){
        return area;
     }
}
