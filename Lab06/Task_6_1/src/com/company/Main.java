package com.company;

public class Main {

    public static void main(String[] args) {

        // Задание 6.1 Реализовать иерархию классов Abstract

        Cylinder cylinder = new Cylinder( 4, 5);
        System.out.println("Cylinder");
        System.out.println("It's volume is: " + cylinder.getVolume());
        System.out.println("It's radius is: " + cylinder.getRadius());

        Ball ball = new Ball( 3);
        System.out.println("Ball");
        System.out.println("It's volume is: " + ball.getVolume());
        System.out.println("It's radius is: " + ball.getRadius());

        Pyramid pyramid = new Pyramid( 9.0,15);
        System.out.println("Pyramid");
        System.out.println("It's volume is: " + pyramid.getVolume());
        System.out.println("It's foundation area is: " + pyramid.getArea());

        Box box = new Box(400);
        System.out.println("Box's size is: " + box.getVolume());

        System.out.println(box.add(ball));         //vol 113
        System.out.println(box.add(cylinder));     //vol 251
        System.out.println(box.add(pyramid));      //vol 45
    }
}
