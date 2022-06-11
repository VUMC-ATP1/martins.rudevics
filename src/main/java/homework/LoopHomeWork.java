package homework;

import java.util.Scanner;

public class LoopHomeWork {

    public static final int PIN = 1256;

    public static void main(String[] args) {

        System.out.println(">>>TASK 1<<<\n");

        /*
        TASK1
        Write a program that reads integers from the user and stops, displaying
        "Done" when the sum of these values exceeds 100.
        a. You need to use a while loop.
        */

        Scanner scan = new Scanner(System.in);
        int number;
        int sum = 0;
        while (sum < 100) {
            System.out.print("Enter a whole number: ");
            number = scan.nextInt();
            sum = sum + number;
        }
        System.out.println("Done");

        System.out.println("\n>>>TASK 2<<<\n");

        /*
        TASK 2
        In the same class and main method below, write a program that reads an integer and
        displays whether the integer is prime or not.
         */

        int num;
        boolean isPrime = true;
        System.out.print("Enter any number: ");
        int userNumber = scan.nextInt();
        for (int i = 2; i <= userNumber / 2; i++) {
            num = userNumber % i;
            if (num == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println(userNumber + " is a Prime number.");
        } else {
            System.out.println(userNumber + " is not a Prime number");
        }

        System.out.println("\n>>>Task3<<<\n");

        /*
        TASK 3
        Define three arrays with data types int, String, char and output all values to the screen using:
         - while;
         - do while;
         - for loop;
         - for each.
         */

        int[] integerArray = {10, 50, 60, 47, 5, 6, 62};
        System.out.println("Printing out int array using WHILE loop");

        int a = 0;

        while (a < integerArray.length) {
            if (a == integerArray.length - 1) {
                System.out.print(integerArray[a]);
            } else {
                System.out.print(integerArray[a] + ", ");
            }
            a++;
        }

        System.out.println("\n");

        System.out.println("Printing out int array using DO WHILE loop");

        a = 0;
        do {
            if (a == integerArray.length - 1) {
                System.out.print(integerArray[a]);
            } else {
                System.out.print(integerArray[a] + ", ");
            }
            a++;
        } while (a < integerArray.length);

        System.out.println("\n");

        System.out.println("Printing out int array using FOR loop");

        for (int i = 0; i < integerArray.length; i++) {
            if (i == integerArray.length - 1) {
                System.out.print(integerArray[i]);
            } else {
                System.out.print(integerArray[i] + ", ");
            }
        }

        System.out.println("\n");

        System.out.println("Printing out int array using FOR EACH loop");

        for (int integer : integerArray) {
            System.out.print(integer + " ");
        }

        System.out.println("\n");

        String[] animalArray = {"Zebra", "Dog", "Piranha", "Tiger", "Cat"};
        System.out.println("Printing out String array using WHILE loop");

        a = 0;
        while (a < animalArray.length) {
            if (a == animalArray.length - 1) {
                System.out.print(animalArray[a]);
            } else {
                System.out.print(animalArray[a] + ", ");
            }
            a++;
        }
        System.out.println("\n");

        System.out.println("Printing out String array using DO WHILE loop");

        a = 0;
        do {
            if (a == animalArray.length - 1) {
                System.out.print(animalArray[a]);
            } else {
                System.out.print(animalArray[a] + ", ");
            }
            a++;
        } while (a < animalArray.length);

        System.out.println("\n");

        System.out.println("Printing out String array using FOR loop");

        for (int i = 0; i < animalArray.length; i++) {
            if (i == animalArray.length - 1) {
                System.out.print(animalArray[i]);
            } else {
                System.out.print(animalArray[i] + ", ");
            }
        }

        System.out.println("\n");

        System.out.println("Printing out String array using FOR EACH loop");

        for (String animal : animalArray) {
            System.out.print(animal + " ");
        }

        System.out.println("\n");

        char[] charArray = {'a', 'b', 'c', 'd', 'f'};
        System.out.println("Printing out char array using WHILE loop");

        a = 0;
        while (a < charArray.length) {
            if (a == charArray.length - 1) {
                System.out.print(charArray[a]);
            } else {
                System.out.print(charArray[a] + " ");
            }
            a++;
        }
        System.out.println("\n");

        System.out.println("Printing out String array using DO WHILE loop");

        a = 0;
        do {
            if (a == charArray.length - 1) {
                System.out.print(charArray[a]);
            } else {
                System.out.print(charArray[a] + ", ");
            }
            a++;
        } while (a < charArray.length);

        System.out.println("\n");

        System.out.println("Printing out String array using FOR loop");

        for (int i = 0; i < charArray.length; i++) {
            if (i == charArray.length - 1) {
                System.out.print(charArray[i]);
            } else {
                System.out.print(charArray[i] + ", ");
            }
        }

        System.out.println("\n");

        System.out.println("Printing out String array using FOR EACH loop");

        for (char character : charArray) {
            System.out.print(character + ", ");

        }

        System.out.println("\n>>>Task4<<<\n");

        /*
        TASK 4
        Define an array of integers of size 100, and use a loop to fill this array with even numbers.
        All values inside the array need to be output on the screen in a single line.
         */

        int[] evenNumbers = new int[100];

        for (int i = 0; i < evenNumbers.length; i++) {
            evenNumbers[i] = i * 2;
            if (i == evenNumbers.length - 1) {
                System.out.print(evenNumbers[i]);
            } else {
                System.out.print(evenNumbers[i] + ", ");
            }
        }

        System.out.println("\n>>>Task5<<<\n");

        /*
        TASK 5
        Write a Java program to calculate the factorial value of a given number.
        a.	This is a method that takes an integer as a parameter.
        b.	Example: Factorial 4 = 4 * 3 * 2 * 1 = 24
         */

        System.out.print("Please enter a whole number: ");
        int userNumber1 = scan.nextInt();


        long factorialNumber = 1;

        if (userNumber1 < 1) {
            System.out.println("INVALID VALUE. PLEASE ENTER NON-NEGATIVE NUMBER.");
        }
        for (int i = 1; i <= userNumber1; i++) {
            factorialNumber = factorialNumber * i;
        }
        System.out.printf("Factorial number of %d = %d", userNumber1, factorialNumber);

        System.out.println("\n>>>Task 6<<<\n");

          /*
          TASK 6
          Set the code so that the user has only three attempts to guess the correct account PIN.
          Create an int constant where the PIN will be stored (public final int VARIABLE_NAME).
          If the password is entered correctly, display "PIN accepted, welcome back".
          If the password is not correct, the screen should display "Invalid PIN, try again".
          When you have finished trying, display "Sorry, but you are locked out".
           */


        System.out.print("Provide four digit PIN number: ");
        int userEnterPin = scan.nextInt();


        if (userEnterPin == PIN) {
            System.out.println("PIN accepted, welcome back.");
        } else {
            System.out.println("Invalid PIN, Try again.");
            for (int i = 0; i < 2; i++) {
                userEnterPin = scan.nextInt();
                if (i == 0) {
                    if (userEnterPin == PIN) {
                        System.out.println("PIN accepted, welcome back.");
                        break;
                    } else {
                        System.out.println("Invalid PIN, Try again.");
                    }
                } else {
                    if (userEnterPin == PIN) {
                        System.out.println("PIN accepted, welcome back.");
                    } else {
                        System.out.println("Sorry, but you are locked out.");
                    }
                }
            }
        }
    }
}


