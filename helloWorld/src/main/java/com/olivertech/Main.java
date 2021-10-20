package com.olivertech;
import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        // TODO: Come back to me
        String name = "Oliver";
        // String name = new String ("Oliver")

        int age = 23;
        long age2 = 20L;

        double pi = 3.14;
        float pi2 = 3.14f;

        char letter = 'A';
//        System.out.println("hello !");
//        System.out.println("hello !");
//        System.out.println(10 % 2 != 1);
//
//        int[] numbers = {1, 2, 3};
//
//        for(int i=0; i < numbers.length; i++){
//            System.out.println(numbers[i]);
//        }
//
//        for(int number : numbers ){
//            System.out.println(number);
//        }

        // Arrays.steam(numbers).forEach(n -> System.out.println(n));

//        if(1 > 2){
//            System.out.println("true");
//        } else if(1==0){
//
//        } else {
//
//        }
//
//        String gender = "Female";
//
//        if(gender.equals("Female")){
//            System.out.println("do something");
//        } else if(gender.equals("Female")){
//            System.out.println("bye");
//        }else {
//
//        }
//        switch(gender){
//            case "Female":
//                System.out.println("do something");
//                break;
//            case "Male":
//                System.out.println("bye");
//                break;
//            default:
//                System.out.println("unknown");
//                System.out.println("unknown");
//        }

//        Scanner scanner = new Scanner(System.in)
//        System.out.println("What is your name?")
//        String input = scanner.nextLine();
//        System.out.printf("Hello " + input);

//        String[] array = {"you", "are", "how", "Hello"};
//
//        for(int i = array.length-1; i >= 0; i--){
//            System.out.println(array[i]);
//        }


        // Exercise 2
//        String numbers = "0.90, 1.00, 9.00, 8.78, 0.01";
//        // make numbers into an array using split
//           String[] arr = numbers.split(", ",0);
//
//           double sum = 0;
//           for (int i=0; i < arr.length; i++){
//               double value = Double.parseDouble(arr[i])
//               sum += value;
//           }
//
//        System.out.println(sum);

        // Exercise 3
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Yes or no?");
//        String input = scanner.nextLine();
//        if(input=="Yes" || input=="No"){
//            System.out.println("knock, knock");
//        } else {
//
//        }
//        System.out.printf(input);


        // Exercise 4
        String longestWord = "";
        String longestWord2 = "";
        String[] arr = {"hello", "ola", "bye", "ciao","bingo"};
        for(int i=0; i < arr.length; i++){
            if(arr[i].length() >= longestWord.length()) {
                longestWord += arr[i];
                longestWord2 += arr[i] + ", ";
            }
        }

        System.out.println(words);




    }
}

