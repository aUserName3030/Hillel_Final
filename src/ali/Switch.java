package ali;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите возраст 8-18: ");
        int i = scanner.nextInt();
        switch (i) {
            case 8:
            case 9:
            case 10:
                System.out.println("Начальная школа");
                break;
            case 11:
            case 12:
            case 13:
            case 14:
                System.out.println("Средняя школа");
                break;
            case 15:
            case 16:
            case 17:
            case 18:
                System.out.println("Старшая школа");
                break;
            default:
                System.out.println("Не корректный ввод");
                break;
        }
    }
}
