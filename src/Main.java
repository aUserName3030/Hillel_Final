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

    public static void main(String[] args) {
        betAdd();
    }
}
