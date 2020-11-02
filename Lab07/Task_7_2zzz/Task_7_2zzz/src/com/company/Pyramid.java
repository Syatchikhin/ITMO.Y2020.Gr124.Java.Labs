package com.company;

public class Pyramid extends Shape {
    //double volume;
    double radius;
    double area;
    int height;

 public Pyramid(double s, int h){
        super(vol);
        this.volume = vol;
        this.area = s;
        this.height = h;
    }

    public   Pyramid(double vol){
        super(vol);
        //super(volume);
        //this.area = s;
        //this.height = h;
    }



    @Override
public double getVolume(){
        return (area * height ) /3;
    }

}
