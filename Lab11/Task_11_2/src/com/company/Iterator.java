package com.company;

//import java.util.Iterator;

public class Iterator {

    private String[] arrayList;
    private int currentSize;
    private int currentIndex = 0;
    public String next(){ return arrayList[currentIndex++];}

    public Iterator(String[] newArray){
        this.arrayList = newArray;
        this.currentSize = arrayList.length;
    }

    public boolean hasNext(){
        return currentIndex <currentSize && arrayList[currentIndex] != null;
    }

}
