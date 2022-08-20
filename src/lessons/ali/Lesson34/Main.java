package lessons.ali.Lesson34;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animalList = new ArrayList<>();
        animalList.add(new Animal(0));
        animalList.add(new Animal(1));

        test(animalList);

        List<Dog> dogList = new ArrayList<>();
        dogList.add(new Dog(2));
        dogList.add(new Dog(3));

        test(dogList);


    }

    private static void test(List<? extends Animal> list) {
        for (Animal animal : list) {
            System.out.println(animal);
            animal.eat();
        }
    }
}
