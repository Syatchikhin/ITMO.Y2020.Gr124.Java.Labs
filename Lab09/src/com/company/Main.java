package com.company;

import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Function<Integer, String> convert = x-> String.valueOf(x) + " долларов";
        //System.out.println(convert.apply(5)); // 5 долларов


       // Function<Integer, String> convert = x-> String.valueOf(x) + " долларов";
        //String res = convert.apply(5);
       // System.out.println(res); // 5 долларов

        // Function which takes in a number and
        // returns half of it
        //Function<Integer, Double> half = a -> a / 2.0;
        // Now treble the output of half function
        //half = half.andThen(a -> 3 * a);
        // apply the function to get the result
        //System.out.println(half.apply(10));
        //String a = "1234";

        //String c;

//        Function<String, String> Fullpath  = a ->  a + a ;
//        System.out.println(Fullpath.apply( "aa" ));  //aaaa

        //Function<String, String> Fullpath  = a ->  Path + a ;
        //System.out.println(Fullpath.apply( "text.txt" ));  //E://Program_files//text.txt

        //String Path = "E://Program_files//";
       // Function<String, String> Fullpath  = a ->  Path + a ;
        //String FP = Fullpath.apply( "text.txt" );  //E://Program_files//text.txt
        //System.out.println(FP);



//        String Path = "E://Program_files//";
//         Function<String, String> Fullpath  = a ->  Path + a ;
//        String FP = Fullpath.apply( "text.txt" );  //E://Program_files//text.txt
//        System.out.println(FP);



    }
}
