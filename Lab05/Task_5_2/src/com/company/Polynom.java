package com.company;

public class Polynom
 {

    String word;
    private static Boolean status;

    Polynom ( String w){
       this.word = w;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public static Boolean getStatus(){
        return status;
    }

    static Boolean checkPolyndrom( String word) {
        // убрать пробелы
        while(word.contains(" ")) {
            String replace = word.replace(" ", "");
            word = replace;
            //System.out.println("полиндром без пробелов: " + word) ;
        }
        System.out.println("полиндром без пробелов: " + word) ;

        int half = Math.abs(word.length() / 2);
        int currentLength = word.length();
        //System.out.print(word + " " + half + " " + currentLength + "\n");
        //**********здесь определяем полиндром или нет ********************
        for (int i = 0; i < half ; i++) {
            if (word.charAt(i) != word.charAt(currentLength - 1)) {

                // не полиндром
                boolean status = false;
                return status;

            }
            if (currentLength - i >= 3) {
                // если более трех букв - отнять 1 букву
                currentLength = currentLength - 1 ;
            }

        }
            //  полиндром
            boolean status = true;
            return status;
    }


 }

