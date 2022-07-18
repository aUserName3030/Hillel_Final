import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bet bet = new Bet();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ставку: ");
        double a = scanner.nextDouble();
        bet.setBet(a);

        System.out.println(bet);
    }
}
