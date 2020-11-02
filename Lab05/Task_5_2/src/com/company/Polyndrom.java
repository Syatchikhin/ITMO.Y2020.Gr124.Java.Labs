package com.company;

public class Polyndrom {

    String word;
    private static Boolean status;

    Polyndrom ( String w){
        this.word = w;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public static Boolean getStatus(){
        return status;
    }

    static Boolean checkPolyndrom( String word) {
        //-----убрать пробелы---------------------------------------------
        while(word.contains(" ")) {
            word = word.replace(" ", "");
        }
        System.out.println("введенные слова без пробелов: " + word) ;

        //-----------здесь определяем полиндром или нет -------------------
        int half = Math.abs(word.length() / 2);
        int currentLength = word.length();
        //System.out.print(word + " " + half + " " + currentLength + "\n");

        for (int i = 0; i < half ; i++) {
            if (word.charAt(i) != word.charAt(currentLength - 1)) {

                // не полиндром
                Boolean status = false;
                System.out.println("полиндром? " + status);
                return status;

            }
            if (currentLength - i >= 3) {
                // если более трех букв - отнять 1 букву
                currentLength = currentLength - 1 ;
            }

        }
        //  полиндром
        Boolean status = true;
        System.out.println("полиндром? " + status);
        return status;
    }




}
