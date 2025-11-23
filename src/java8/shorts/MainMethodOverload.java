package java8.shorts;

public class MainMethodOverload {
    public static void main(String[] args) {
        System.out.println("Main Method");

        main("Hello Manual method");
    }

    public static void main(String args) {
        System.out.println("Overloaded main method");
    }
}
