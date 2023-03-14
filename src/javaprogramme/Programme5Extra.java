package javaprogramme;

import java.util.Scanner;

/**
 * 5. Write a program for a calculator with addition, subtraction, multiplication
 * and division methods all with parameters and use string concatenation
 * methods.(Note: Two static and Two instance methods.)
 */
public class Programme5Extra {


    public static void main(String[] args) {
        calculator1();
        Programme5Extra obj = new Programme5Extra();
        obj.calculator2();

    }


    public static void calculator1() {
        int first, second, add, subtract;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers for addition and subtraction  : ");
        first = scanner.nextInt();
        second = scanner.nextInt();

        add = first + second;
        subtract = first - second;
        System.out.println("Addition = " + add);
        System.out.println("Subtraction = " + subtract);
        scanner.close();

    }

    public void calculator2() {
        int first, second, multiply, divide;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers of multiplication and division : ");
        first = scanner.nextInt();
        second = scanner.nextInt();

        multiply = first * second;
        divide = first / second;
        System.out.println("Multiplication = " + multiply);
        System.out.println("Division = " + divide);
        scanner.close();

    }

}