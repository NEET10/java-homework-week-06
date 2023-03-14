package javaprogramme;

/**
 * 5. Write a program for a calculator with addition, subtraction, multiplication
 * and division methods all with parameters and use string concatenation
 * methods.(Note: Two static and Two instance methods.)
 */

public class Programme5 {

    public static void main(String[] args) {
        Programme5 obj = new Programme5();
        obj.addition(2, 4, 6, 8);
        obj.subtraction(35, 25);
        multiplication(2000000l, 2000000l, 200000l);
        division(30, 5);


    }
    void addition(int a, int b, int c, int d) {
        int e = a + b;
        int f = c + d;
        int ans = e + f;
        System.out.println(ans);

    }

    private void subtraction(int g, int h) {
        int ans = g - h;
        System.out.println(ans);

    }

    public static void multiplication(long i, long j, long k) {
        long ans = i * j * k;
        System.out.println(ans);
    }

    private static void division(int l, int m) {
        int ans = l / m;
        System.out.println(ans);
    }
}
