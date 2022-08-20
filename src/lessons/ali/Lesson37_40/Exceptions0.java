package lessons.ali.Lesson37_40;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exceptions0 {
    static File file = new File("testPath");

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(file);
            System.out.println("Что-то произошло");
        } catch (FileNotFoundException e ) {
            //e.printStackTrace();
            System.out.println("Файл не найден");
        }
        System.out.println("Закончили");

        //readFile();
    }

    public static void readFile() throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
    }
}
