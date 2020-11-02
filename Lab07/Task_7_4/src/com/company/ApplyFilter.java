package com.company;

public class ApplyFilter {

    public static Object[] filter(Object[] arr, Filter f)
    {
        int count = 0;
        Object [] aTwo = new Object[arr.length];

        for ( int i = 0; i < arr.length; i++) {
            if (!f.apply(arr[i])){
                aTwo[count] = arr[i];
                count++;

            }
        }

        Object [] arrResult = new Object[count];

        //System.out.println(arrResult[j];
        if (count >= 0) System.arraycopy(aTwo, 0, arrResult, 0,count);
        return arrResult;

    }



}