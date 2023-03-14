package javaprogramme;

import java.util.Scanner;

/**
 * 6. Write a program to enter any radius value of the circle and find out the
 * area.(Formula of Area A=PI*r*r).
 */

public class Programme6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the radius value of the circle : ");
        double radius = s.nextDouble();
        System.out.println("Circle area is = " + (3.14 * radius * radius));
        s.close();
    }
}
