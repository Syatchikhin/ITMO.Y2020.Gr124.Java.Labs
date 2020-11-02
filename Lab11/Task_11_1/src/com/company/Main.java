package com.company;

import java.util.*;
//import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        // 11.1  Написать итератор по массиву (одномерному, потом обобщить до двумерного)

        String[] myarray = new String[]{"1","2","3","4","5"};


        Iterator it = new Iterator(myarray);
        while (it.hasNext()){
            System.out.println(it.next());
        }


    }
 }