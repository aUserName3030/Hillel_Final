package lessons.ali.Lesson37_40;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class Exceptions3 {
    public static void main(String[] args) throws IOException, ParseException {
        run();

        try {
            run();
        } catch (IOException e) {
            e.fillInStackTrace();
        } catch (Exception a) {
            a.fillInStackTrace();
        } /* catch (ParseException c) {
            c.fillInStackTrace();
        }*/
    }

    public static void run() throws IOException, FileNotFoundException, IllegalArgumentException, ParseException {

    }
}
