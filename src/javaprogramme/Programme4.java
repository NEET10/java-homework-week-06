package javaprogramme;

/**
 * 4. Write a Java programme using the following steps.
 * 4.1 Declare two instance and two static variables.
 * 4.2 Declare one instance method.
 * 4.3 Declare one static method.
 * 4.4 Call all four instance and static variables into both instance and static methods inside the
 * print statement.
 * 4.5 Declare the Main method.
 * 4.6 Call both instance and static methods into the Main method and run the programme.
 */

public class Programme4 {

    static String UK1 = "England";
    static String UK2 = "Scotland";
    String UK3 = "Wales";
    String UK4 = "Northen Ireland";

    public static void main(String[] args) {
        country();
        Programme4 obj = new Programme4();
        obj.gb();

    }

    protected static void country() {
        System.out.println(UK1);
        System.out.println(UK2);

    }

    private void gb() {
        System.out.println(UK3);
        System.out.println(UK4);

    }


}
