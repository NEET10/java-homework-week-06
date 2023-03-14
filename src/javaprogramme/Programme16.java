package javaprogramme;

import java.util.Scanner;

/**
 * 16. Write a Java program to add two binary numbers.
 * <p>
 * Input Data:
 * Input first binary number: 10
 * Input second binary number: 11
 * Expected Output:
 * <p>
 * Sum of two binary numbers: 101
 */

public class Programme16 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter The First and Second Numbers = ");
        String b1 = s.nextLine();
        String b2 = s.nextLine();

        int num1 = Integer.parseInt(b1, 2);
        int num2 = Integer.parseInt(b2, 2);

        int output = num1 + num2;

        System.out.print("\nThe Sum = ");
        System.out.print(Integer.toBinaryString(output));
        s.close();
    }
}




