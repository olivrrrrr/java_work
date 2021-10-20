package com.olivertech;

public class Exercise2 {
    public static void main(String[] args) {
        // Exercise 2
        String numbers = "0.90, 1.00, 9.00, 8.78, 0.01";
        // make numbers into an array using split
           String[] arr = numbers.split(", ",0);
           double sum = 0;
           for (int i=0; i < arr.length; i++){
               double value = Double.parseDouble(arr[i]);
               sum += value;
           }
    }


}
