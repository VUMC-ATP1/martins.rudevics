package homework.classHomework;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        1.Create a triangle with the no-arg constructor. Assign edge values to this object and
        call all methods from this object and output the result to the screen.
        2. Create a new triangle with the constructor, where all edges are fed into the constructor.
        Call all methods from this object and output the results to the screen.
         */

        Scanner scan = new Scanner(System.in);
        //TASK 1
        System.out.println(">>>TASK 1<<<\n");
        Triangle weAreCreatingTriangle1 = new Triangle();
        System.out.print("Enter first side lenght of triangle: ");
        weAreCreatingTriangle1.firstSide = scan.nextInt();
        System.out.print("Enter second side lenght of triangle: ");
        weAreCreatingTriangle1.secondSide = scan.nextInt();
        System.out.print("Enter third side lenght of triangle: ");
        weAreCreatingTriangle1.thirdSide = scan.nextInt();

        Triangle weAreCreatingTriangle2 = new Triangle(weAreCreatingTriangle1.firstSide, weAreCreatingTriangle1.secondSide, weAreCreatingTriangle1.thirdSide);

        System.out.println("This triangle area is " + weAreCreatingTriangle2.areaOfTriangle);

        if (weAreCreatingTriangle1.isEquilateral()) {
            System.out.print("Given triangle is Equilateral.");
        } else {
            System.out.println("Given triangle is not Equilateral");
        }

        if (weAreCreatingTriangle1.isIsosceles()) {
            System.out.println("Given triangle is Isosceles.");
        } else {
            System.out.println("Given triangle is not Isosceles.");
        }

        //TASK 2
        System.out.println("\n>>>TASK 2<<<\n");

        Triangle weAreCreatingTriangle3 = new Triangle();
        System.out.print("Enter first side lenght of triangle: ");
        int firstSide = scan.nextInt();
        System.out.print("Enter second side lenght of triangle: ");
        int secondSide = scan.nextInt();
        System.out.print("Enter third side lenght of triangle: ");
        int thirdSide = scan.nextInt();
        Triangle weAreCreatingTriangle4 = new Triangle(firstSide, secondSide, thirdSide);

        System.out.println("This triangle area is " + weAreCreatingTriangle4.areaOfTriangle);

        if (weAreCreatingTriangle3.isEquilateral()) {
            System.out.println("Given triangle is Equilateral");
        } else {
            System.out.println("Given triangle is not Equilateral");
        }

        if (weAreCreatingTriangle3.isIsosceles()) {
            System.out.println("Given triangle is Isosceles");
        } else {
            System.out.println("Given triangle is not Isosceles");
        }
    }
}
