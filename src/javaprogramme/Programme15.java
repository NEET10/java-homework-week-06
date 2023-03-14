package javaprogramme;


/**
 * 15. Write a Java program to swap two variables.
 */

public class Programme15 {
    public static void main(String[] args) {
        int x = 10, y = 20;
        x = x+y;
        y = x-y;
        x = x-y;
        System.out.println("x :" + x);
        System.out.println("y :" + y);



    }
}
