package lessons.ali.Lesson33;

import lessons.ali.Lesson32.Animal;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*
        List animals = new ArrayList();
        Animal animal = new Animal();

        animals.add("cat0");
        animals.add("cat1");
        animals.add("cat2");
        animals.add(animal);

        String animalName = (String) animals.get(3);
        System.out.println(animal);

         */

        List<String> animals = new ArrayList<>();
        Animal animal = new Animal();

        animals.add("cat0");
        animals.add("cat1");
        animals.add("cat2");
        //animals.add(animal); ошибка

    }
}
