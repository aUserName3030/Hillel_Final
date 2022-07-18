import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    static Bet bet = new Bet();
    static Storage storage = new Storage();

    public static void betAdd() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Введите ставку: ");
            double a = scanner.nextDouble();
            bet.setBet(a);
            storage.add(a);
        } catch (Exception BetException) {
            System.out.println("Не корректно введены данные из клавиатуры");
            System.out.println(BetException);
        }

        System.out.println("Хотите ввести ещё ставку? y/n");
        String c = scanner.next();


        if (c.equals("n")) {
            System.out.println(storage);
        } else {
            betAdd();
        }

    }

    public static void betAddBuffer() {
        InputStreamReader iReader = new InputStreamReader(System.in);
        BufferedReader bReader = new BufferedReader(iReader);

        try {
            System.out.print("Введите ставку: ");
            double a = Double.parseDouble(bReader.readLine());
            bet.setBet(a);
            storage.add(a);
        } catch (Exception BetException) {
            System.out.println("Не корректно введены данные из клавиатуры");
            System.out.println(BetException);
        }

        System.out.println("Хотите ввести ещё ставку? y/n");

        String c = null;

        try {
            c = bReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }


        if (c.equals("n")) {
            System.out.println(storage);
        } else {
            betAddBuffer();
        }
    }

    public static void main(String[] args) {
        betAddBuffer();
    }
}
