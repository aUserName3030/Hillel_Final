package lessons.ali.Lesson32;

public class Main {
    public static void main(String[] args) {
        //upcasting
        Dog dog = new Dog();
        Animal animal = dog;

        //downcasting
        Dog dog2 = (Dog) animal;
        dog2.bark();

        //error
        Animal animal1 = new Animal();
        Dog dog1 = (Dog) animal1;
        dog1.bark();

    }
}
