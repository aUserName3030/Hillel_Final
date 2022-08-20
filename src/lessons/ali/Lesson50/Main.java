package lessons.ali.Lesson50;

public class Main {
    public static void main(String[] args) {
        //someMethod();
        count(0);
        System.out.println(factorial(10));
    }

    private static void someMethod() {
        System.out.println("StackOverflow");
        someMethod();
    }

    private static void count(int i) {
        System.out.println(i);
        if (i == 42) {
            return;
        }

        count(++i);
    }

    private static int factorial(int i) {
        if (i == 1) {
            return 1;
        }

        return i*factorial(i - 1);
    }
}
