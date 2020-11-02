package com.company;

public class Main {

    public static void main(String[] args) {
	//  заменить в тексте все вхождения слова «бяка» на «[вырезано цензурой]

        Cenzor.checkCenzor("аргентина манит негра бяка");
        Cenzor.checkCenzor("сам ты бяка");
        Cenzor.checkCenzor("редиска нехороший человек");
        Cenzor.checkCenzor("Там, где живет Бяка");
        Cenzor.checkCenzor("СОБЯКА");
    }
}
