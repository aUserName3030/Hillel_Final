package lessons.ali.Lesson07;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int i = s.nextInt();
        System.out.println("Введено " + i);
    }
}
