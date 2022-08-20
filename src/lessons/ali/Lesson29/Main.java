package lessons.ali.Lesson29;

public class Main {
    public static void main(String[] args) {
        /*Animal animal = new Animal();
        Dog dog = new Dog();

        animal.eat();
        dog.eat();*/

        Animal animal = new Dog();
        animal.eat();
        //animal.bark();

        Dog dog = new Dog();
        dog.eat();
        dog.bark();

        Animal animal1 = new Animal();
        Dog dog1 = new Dog();
        Cat cat = new Cat();

        test(animal1);
        test(dog1);
        test(cat);
    }

    public static void test(Animal animal) {
        animal.eat();
    }
}
