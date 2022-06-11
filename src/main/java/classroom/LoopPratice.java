package classroom;

import java.util.Arrays;

public class LoopPratice {
    public static void main(String[] args) {
        //do
        // Exercise: print 0 -4;

//        System.out.println("START");
//        int i = 0;
//        while (i < 5) {
//            System.out.println(i);
//            i++;
//            //i = i + 1;
//        }
//        System.out.println("END");
//
//        i = 10;
//        while (i > 0) {
//            System.out.println(i);
//            i--;
//        }
//
//
//        //Print all numbers using a loop
//        int[] arr = {2, 4, 6, 10, 15};
//
//        int num = 0;
//        while (num < arr.length) {
//            System.out.println(arr[num]);
//            num++;
//        }

//        // Print out even numbers from 0 to 10 while loop
//        int x = 0;
//        while (x <= 10) {
//            if (x % 2 == 0) {
//                System.out.print(x + ", ");
//            }
//            x++;
//        }

//        int num = 0;
//        do {
//            System.out.print(num + ", ");
//            num++;
//        } while (num < 10);

        // Print out odd numbers from 0 to 10 while loop
//        int a = 0;
//        do {
//            if (a % 2 != 0) {
//                System.out.println(a);
//            }
//            a++;
//        } while (a < 10);

        String[] countries = new String[]{"LV", "USA", "UK", "CZ", "PL"};
        // If country = lv, print - Latvia
        // If country = cz, print - Czech
        // All other countries just print
        // do while

//        int num = 0;
//
//        do {
//            if (countries[num].equals("LV")) {
//                System.out.println("Latvia");
//            } else if (countries[num].equals("CZ")) {
//                System.out.println("Czech");
//            } else {
//                System.out.println(countries[num]);
//                num++;
//            }
//        } while (num < countries.length) ;

        for (int i = 0; i < countries.length; i++) {
            if(i == countries.length - 1) {
                System.out.println(countries[i]);
            }
            System.out.print(countries[i] + ", ");
        }
        System.out.println();
//
//
//        // Print numbers from 0 to 100 using for loop
//        for (int i = 0; i <=100; i++) {
//                System.out.println(i + " ");
//            }
//
//
//        // Print numbers from 50 to 100 using for loop
//        for (int i = 0; i <=100; i++) {
//            if(i>50){
//                System.out.println(i + " ");
//            }
//        }

        //Create int[] with 0  to 100
        //Print only even number

//        int[] number = new int[100];
//
//        for (int i = 0; i < number.length; i++) {
//            number[i] = i;
//        }
//        for (int k = 0; k <= number.length; k++) {
//            if (k % 2 == 0) {
//                System.out.print(k + " ");
//            }
//        }
//
//        for (String country : countries) {
//            if (country.equals("LV")) {
//                System.out.println("Latvia");
//            } else {
//                System.out.println(country);
//            }
//        }
//
//        //Create int[] with from 0 to 100
//        //Print all numbers with for each
//
//        int[] numbers = new int[100];
//
//        for (int b = 0; b < numbers.length; b++) {
//            numbers[b] = b;
//        }
//
//        for (int digits : numbers) {
//            System.out.println(digits + " ");
//        }
//
//        int[] house = new int[50];
//
//        for (int i = 0; i < house.length; i++) {
//            house[i] = i;
//        }
//        for (int i = 0; i <= 50; i++) {
//            if (i % 3 != 0 && i % 5 != 0) {
//                System.out.println("Mājās ar nummuru: " + i);
//            }
//        }
//
//        int houseCount = 0;
//        for (int k = 0; k <=50 ; k++) {
//            if(k%3==0 || k%5==0){
//                System.out.println("Nummuri neder: " + k);
//            } else {
//                System.out.println("Nummuri der: " + k);
//                houseCount = houseCount + 1;
//            }
//        }
//        System.out.println("Nummuru skaits: " + houseCount);
//
//
//        String sentence = "Hello, my name is Nikita";
//        // count how many i are in the sentence
//        // sentence.charAT(2)
//
//        int count = 0;
//
//        for (int i = 0; i < sentence.length(); i++) {
//            if(sentence.charAt(i) == 'i'){
//                count = count +1;
//            }
//        }
//        System.out.println("i skaits: " + count);
    }
}

