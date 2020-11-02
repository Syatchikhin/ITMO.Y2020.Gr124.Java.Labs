package com.company;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
	//  7.2 Shape должен наследоваться от Comparable. То есть, shapes должно быть
        //сравнимы по объему.
        //Можно воспользоваться методом Arrays.sort(), чтобы убедится, что массив фигур
        //сортируется верно.
        TreeSet<Shape> shapes = new TreeSet<>();

        Shape pyramid = new Pyramid( 9.0,15);     //vol 45
        Shape cylinder = new Cylinder( 4, 5);    //vol 251
        Shape  ball = new Ball( 3);                 //vol 113
        Shape box = new Box(400);                   //vol 400

        shapes.add(pyramid);
        shapes.add(cylinder);
        shapes.add(ball);
        shapes.add(box);

        System.out.println("Pyramid's's volume is: " + pyramid.getVolume());
        System.out.println("Cylinder's volume is: " + cylinder.getVolume());
        System.out.println("Ball's volume is: " + ball.getVolume());
        System.out.println("Box's volume is: " + box.getVolume());

        for (Shape shape: shapes){
            System.out.println("Shape's volume is: " + shape.getVolume());
        }

}


}
