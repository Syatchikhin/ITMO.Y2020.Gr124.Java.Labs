package com.company;

public class Main {

    public static void main(String[] args) {
        //  7.1 Заменить класс Shape на интерфейс Shape
        Cylinder cylinder = new Cylinder( 4, 5);
        System.out.println("Cylinder");
        System.out.println("It's volume is: " + cylinder.getVolume());


        Ball ball = new Ball( 3);
        System.out.println("Ball");
        System.out.println("It's volume is: " + ball.getVolume());


        Pyramid pyramid = new Pyramid( 9.0,15);
        System.out.println("Pyramid");
        System.out.println("It's volume is: " + pyramid.getVolume());


        Box box = new Box(400);
        System.out.println("Box's size is: " + box.getVolume());




        System.out.println(box.add(ball));         //vol 113
        System.out.println(box.add(cylinder));     //vol 251
        System.out.println(box.add(pyramid));      //vol 45

//    // Sorting:
        //   ArrayList<Shape> shapes = box.getShapes();
        //  Collections.sort(shapes); // sorted by Volume!
    }


}
