package com.olivertech;

public class Exercise4 {
    public static void main(String[] args) {
        // Exercise 4
        String longestWord = "";
        String longestWord2 = "";
        String[] arr = {"hello", "ola", "bye", "ciao", "bingo", "aaaaa"};
        for(int i=0; i < arr.length; i++){
            if(arr[i].length() >= longestWord.length()) {
                longestWord += arr[i];
            }
        }
        System.out.println(longestWord);
    }
}
