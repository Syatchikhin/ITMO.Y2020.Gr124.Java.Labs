package com.company;

import java.util.HashMap;
import java.util.Map;

public class TaskToMap {
    private String[] arrayList;
    private int currentSize;

    public TaskToMap(String[]newArray){
        this.arrayList = newArray;
        this.currentSize = arrayList.length;
    }

    private int currentIndex = 0;

    public boolean hasNext() {
        return currentIndex < currentSize && arrayList[currentIndex] != null;
    }

    public String next() { return arrayList[currentIndex++]; }

    public Map<String, Integer> arrayToMap(){
        Map<String, Integer> map = new HashMap<>();
        while(hasNext()){
            if (!map.containsKey(arrayList[currentIndex])){
                map.put(arrayList[currentIndex],1);

            }
            else
                map.put(arrayList[currentIndex],map.get(arrayList[currentIndex])+1);
            next();
        }
        return map;
    }




}
