package lessons.ali.Lesson37_40;

import java.util.Scanner;

public class Exceptions1 {
    public static void main(String[] args) throws ScannerException {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int x = Integer.parseInt(scanner.nextLine());

            if (x != 0) {
                throw new ScannerException("Что-то пошло не так");
                /*try {
                    throw new IOException();
                } catch (IOException e) {
                    System.out.println("Введён не 0");
                }*/
            }
        }

    }
}
