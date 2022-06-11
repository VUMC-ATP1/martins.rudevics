package homework.classHomework;

public class Triangle {

    /*
    TASK - 1
    1. In the 'classHomework' package, create a 'triangle' class.
        a.	The class must contain variables of all side lengths (integers) and an area
        b.	The class must have a no-arg constructor that says we are making a triangle
        c.	The class must have an arg constructor where all three sides are given and the area of the triangle is
        immediately calculated(heron formula) and stored in the area variable
        d.	The class must have a method that returns true/false or the triangle is equilateral
        e.	The class must have a method that returns true/false or the triangle is isosceles
     */

    public int firstSide;
    public int secondSide;
    public int thirdSide;
    public int areaOfTriangle;

    public Triangle() {
        System.out.println("We are creating a triangle.");
    }

    public Triangle(int firstSide, int secondSide, int thirdSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;

        double semiPerimeter = (this.firstSide + this.secondSide + this.thirdSide) / 2.0d;
        double area = Math.sqrt(semiPerimeter * (semiPerimeter - this.firstSide) * (semiPerimeter - this.secondSide) * (semiPerimeter - this.thirdSide));
        this.areaOfTriangle = (int) area;
    }

    public boolean isEquilateral() {
        return this.firstSide == this.secondSide && this.secondSide == this.thirdSide;
    }

    public boolean isIsosceles() {
        return this.firstSide == this.secondSide || this.secondSide == this.thirdSide || this.thirdSide == this.firstSide;
    }
}

