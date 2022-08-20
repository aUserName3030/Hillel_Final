package lessons.ali.Lesson45_47;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("D:\\WORK\\Hilell\\Season_2\\Leson_1\\src\\" +
                "lessons\\bet\\ali\\Lesson45\\people.bin");
        /*FileInputStream fileInputStream = new FileInputStream("D:\\WORK\\Hilell\\Season_2\\Leson_1\\src\\" +
                "lessons\\bet\\ali\\Lesson45\\humanity.bin");*/
        /*FileInputStream fileInputStream = new FileInputStream("D:\\WORK\\Hilell\\Season_2\\Leson_1\\src\\" +
                "lessons\\bet\\ali\\Lesson45\\humanity2.bin");*/
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        Human human = (Human) objectInputStream.readObject();
        Human human1 = (Human) objectInputStream.readObject();

        System.out.println(human);
        System.out.println(human1);
        /*
        int count = objectInputStream.readInt();
        Human[] humanity = new Human[count];

        for (int i = 0; i <count; i++) {
            humanity[i] = (Human) objectInputStream.readObject();
        }

        System.out.println(Arrays.toString(humanity));
*/
        /*Human[] humanity = (Human[]) objectInputStream.readObject();
        System.out.println(Arrays.toString(humanity));*/
        objectInputStream.close();

    }
}
