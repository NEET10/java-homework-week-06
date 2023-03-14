package javaprogramme;

/**
 * 14. Write a Java program to print the area and perimeter of a rectangle.
 * Test Data:
 * Width = 5.5 Height = 8.5
 * Expected Output:
 * Area is 5.6 * 8.5 = 47.60
 * Perimeter is 2 * (5.6 + 8.5) = 28.20
 */

public class Programme14 {
    public static void main(String[] args) {
        double W = 5.5;
        double H = 8.5;
        double a = W * H;
        double b = W + H;
        double c = 2 * (b);
        System.out.println("Area is " + W + " *  " + H + " = " + a) ;
        System.out.println("Perimeter is 2" + " * " + "(5.5 + 8.5)" + " = " + c);
    }
}
