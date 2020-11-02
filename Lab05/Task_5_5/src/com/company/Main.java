package com.company;

public class Main {

    public static void main(String[] args) {
	// 5.5 Напишите метод, который инвертирует слова в строке. Предполагается, что в
        //строке нет знаков препинания, и слова разделены пробелами.
        //Sample Output:
        //The given string is: This is a test string
        //The string reversed word by word is:
        //sihT si a tset gnirts

        Reverse.makeReverse("This is a test string");
        Reverse.makeReverse("Аргентина манит негра");
        Reverse.makeReverse("А роза упала на лапу Азора");


    }
}
