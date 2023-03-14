package javaprogramme;

import java.util.Scanner;

/**
 * 7. Write a program to insert any temperature value in degree Fahrenheit and
 * convert to degree Celsius ((F − 32) × 5/9 = 0°C).
 */

public class Programme7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the temperature value in degree Fahrenheit : ");
        double fahrenheit = s.nextDouble();
        System.out.println(((fahrenheit - 32) * 5 / 9) + "in celsius ");
        s.close();
    }
}
