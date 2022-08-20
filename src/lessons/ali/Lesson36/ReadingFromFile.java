package lessons.ali.Lesson36;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ReadingFromFile {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("D:\\WORK\\Hilell\\Season_2\\Leson_1\\src\\lessons\\bet\\ali\\Lesson36\\" +
                "TestFile");
        File file01 = new File("D:\\WORK\\Hilell\\Season_2\\Leson_1\\src\\lessons\\bet\\ali\\Lesson36\\" +
                "TestFile01");

        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());

        }

        scanner.close();

        Scanner scanner2 = new Scanner(file01);
        String line = scanner2.nextLine();
        String[] numberString = line.split(" ");
        int[] numbers = new int[3];
        int i = 0;

        for (String number : numberString) {
            numbers[i++] = Integer.parseInt(number);
        }

        System.out.println(Arrays.toString(numbers));

        scanner2.close();
    }
}
