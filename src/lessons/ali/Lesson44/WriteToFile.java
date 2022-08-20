package lessons.ali.Lesson44;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteToFile {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("D:\\WORK\\Hilell\\Season_2\\Leson_1\\src\\lessons\\bet\\ali\\Lesson44\\test");
        PrintWriter printWriter = new PrintWriter(file);

        printWriter.println("Test-test");
        printWriter.println("Test-test2");

        printWriter.close();
    }
}
