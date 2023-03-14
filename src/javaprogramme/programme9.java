package javaprogramme;

import java.util.Scanner;

/**
 * 9. Write a program to convert the upper case to lower case.
 */

public class programme9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(" Enter the upper case text : ");
        String text = s.nextLine();
        System.out.println(text.toLowerCase());
        s.close();
    }
}

