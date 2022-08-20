package lessons.ali.Lesson45_47;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) throws IOException {
        Human human = new Human(1,"Adam");
        Human human1 = new Human(2,"Eve");

        FileOutputStream fileOutputStream = new FileOutputStream("D:\\WORK\\Hilell\\Season_2\\Leson_1\\src\\" +
                "lessons\\bet\\ali\\Lesson45\\people.bin");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(human);
        objectOutputStream.writeObject(human1);
        objectOutputStream.close();
        /*
        Human[] humanity = {human,human1};
        FileOutputStream fileOutputStream = new FileOutputStream("D:\\WORK\\Hilell\\Season_2\\Leson_1\\src\\" +
                "lessons\\bet\\ali\\Lesson45\\humanity.bin");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeInt(humanity.length);

        for (Human h : humanity) {
            objectOutputStream.writeObject(h);
        }*/
        /*Human[] humanity = {human,human1};
        FileOutputStream fileOutputStream = new FileOutputStream("D:\\WORK\\Hilell\\Season_2\\Leson_1\\src\\" +
                "lessons\\bet\\ali\\Lesson45\\humanity2.bin");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(humanity);*/

        objectOutputStream.close();

    }
}

