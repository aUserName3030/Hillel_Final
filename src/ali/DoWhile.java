package ali;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i;
        do {
            System.out.print("Введите 5: ");
            i = scanner.nextInt();
        } while (i != 5);

        System.out.println("Вы ввели 5");
    }
}
