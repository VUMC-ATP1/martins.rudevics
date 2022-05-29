package homeworkTwo;

import java.util.Scanner;

public class HomeWorkTwo {
    public static void main(String[] args) {

        System.out.println("TASK - 1\n");
        // a.whether x is positive (get result true)
        int x = 6;
        System.out.printf("Is number " + x + " positive: %b%n", x > 0);
        // b.whether x is negative (result false)
        System.out.printf("Is number " + x + " negative: %b%n", x < 0);
        // c.whether x is greater than 5 and x is less than or equal to 10 (get result true)
        System.out.printf("Is number " + x + " greater than 5 and is less than or equal to 10: %b%n", x > 5 && x <= 10);
        // d.whether x is NOT less than or equal to 5 and x is less than 10 (get result true)
        System.out.printf("Is number " + x + " NOT less or equal to 5 and is less than 10: %b%n", x >= 5 && x < 10);
        // e.x equals 0 or x equals 10 (result false)
        System.out.printf("Is number " + x + " equals 0 or equals 10: %b%n", x == 0 || x == 10);
        //f.whether the product of x * x is greater than 10 (results true)
        System.out.printf("Is product of x * x is greater than 10: %b%n", x * x > 10);

        System.out.println("\nTASK - 2\n");

        /*
        Task2
        Write a program that accepts the Month number (integer) and displays the month name with the word. (use switch)
        */


        int nameOfTheMonth;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between from 1 to 12 to print out month name with words:");
        nameOfTheMonth = scanner.nextInt();

        switch (nameOfTheMonth) {
            case 1:
                System.out.println("Number 1 is equal to: January.");
                break;
            case 2:
                System.out.println("Number 2 is equal to: February.");
                break;
            case 3:
                System.out.println("Number 3 is equal to: March.");
                break;
            case 4:
                System.out.println("Number 4 is equal to: April.");
                break;
            case 5:
                System.out.println("Number 5 is equal to: May.");
                break;
            case 6:
                System.out.println("Number 6 is equal to: June.");
                break;
            case 7:
                System.out.println("Number 7 is equal to: July.");
                break;
            case 8:
                System.out.println("Number 8 is equal to: August.");
                break;
            case 9:
                System.out.println("Number 9 is equal to: September.");
                break;
            case 10:
                System.out.println("Number 10 is equal to: October.");
                break;
            case 11:
                System.out.println("Number 11 is equal to: November.");
                break;
            case 12:
                System.out.println("Number 12 is equal to: December.");
                break;
            default:
                System.out.println("!!!There is no such month!!!");
        }

        System.out.println("\nTASK - 3\n");
        /*
        Task3:
        Write a program that accepts three integers and outputs to the screen which is the largest of the three integers.
        */
        int num1, num2, num3;
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter first number: ");
        num1 = sc.nextInt();
        System.out.print("Please enter second number: ");
        num2 = sc.nextInt();
        System.out.print("Please enter third number: ");
        num3 = sc.nextInt();

        int theLargestNumber = Math.max(Math.max(num1, num2), num3);

        System.out.println("The largest number between three entered numbers is " + theLargestNumber);

        System.out.println("\nTASK - 4\n");
        /*
        Task 4
        write a program that reads the colour (String) red/yellow/green and outputs to the screen the pedestrian's
        actions at the traffic light. Also write what to do if no green/yellow/red light is on. Reminder: to compare
        a String to some other String value, equals should be used, e.g. color.equals("Blue")
         */

        String colorOfTheLight = "Green";
        if (colorOfTheLight.equals("Red")) {
            System.out.println("You cannot cross the street right now. Wait when the traffic light will be green.");
        } else if (colorOfTheLight.equals("Yellow")) {
            System.out.println("Be careful as the traffic light changes.");
        } else if (colorOfTheLight.equals("Green")) {
            System.out.println("You can cross the street now.");
        } else {
            System.out.println("The traffic lights are not on, look both ways before crossing the street.");
        }

        System.out.println("\nTASK - 5\n");
        /*
        Task 5
        Write a separate method printBusinessCard that returns nothing but displays a business card with the
        person's name, phone and year of birth. In the main method, call this method three times and display the
        business card 3 times.
         */
        printBusinessCard();
        printBusinessCard();
        printBusinessCard();

        System.out.println("\nTASK - 6\n");

        /*
        Task6
        Create a new method as in Task 5, but called printBusinessCardTwo() , so that this method accepts as arguments
        a first name, last name, phone and year of birth and outputs the business card to the screen.
        The method does not need to return any value. Call the method 2 times in the main() method with
        different parameters
         */
        printBusinessCardTwo("Pete", "Pen", "+371 12345678", 1950);
        printBusinessCardTwo("Sam", "Church", "+370 12345678", 1960);


        System.out.println("\nTASK - 7\n");

        /*
        Write a sum method that accepts two integers as arguments and returns the sum of these integers as an integer
        (but does not print to the screen). Then define a variable sum in the main() method, assign that variable the
        value returned by the method. Then print the variable summa to the screen.
         */
        int summa = sum(20, 50);
        System.out.println("Two interger sum is: " + summa);


        System.out.println("\nTASK - 8\n");
        /*
        Task 8
        Write a method average that accepts 3 decimals(double) and returns the result as a decimal(double).
        Then print the result of this method in the main method.
         */

        System.out.println("The average of three decimal numbers is: " + average(20.6d, 25.3d, 60d));
    }


    //Method for Task 5
    public static void printBusinessCard() {
        System.out.println("BusinessCard");
        System.out.println("##########");
        System.out.println("Name: Jānis");
        System.out.println("Surname: Bērziņš");
        System.out.println("Phone number: +371 12345678");
        System.out.println("Year of birth: 1990");
        System.out.println("##########");
    }


    // Method for Task 6
    public static void printBusinessCardTwo(String name, String surname, String phoneNumber, int yearOfBirth) {
        System.out.println("BusinessCard");
        System.out.println("##########");
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Phone number: " + phoneNumber);
        System.out.println("Year of birth: " + yearOfBirth);
        System.out.println("##########");
    }

    // Method for Task 7
    public static int sum(int a, int b) {
        return (a + b);
    }

    // Method for Task 8
    public static double average(double num1, double num2, double num3) {
        return ((num1 + num2 + num3) / 3);
    }
}
