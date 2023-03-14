package javaprogramme;

import java.util.Scanner;

/**
 * 17. Write a Java program to convert a decimal number to binary number.
 *
 * Input Data:
 * Input a Decimal Number : 5
 * Expected Output
 *
 * Binary number is: 101
 */

public class Programme17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the decimal number : ");
        int num = in.nextInt();
        String b = Integer.toBinaryString(num);
        System.out.println(b);
        in.close();

        }


    }

