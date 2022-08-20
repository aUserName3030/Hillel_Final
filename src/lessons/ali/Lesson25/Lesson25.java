package lessons.ali.Lesson25;

public class Lesson25 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();
        animal.sleep();
        Dog dog = new Dog();
        dog.eat();
        dog.sleep();
        dog.bark();
    }
}

class Animal {

    public void eat() {
        System.out.println("Ном-ном...");
    }

    public void sleep() {
        System.out.println("Zzz...");
    }
}

class Dog extends Animal {

    public void bark(){
        System.out.println("Вуф!");
    }

    public void eat() {
        System.out.println("Чавк-чавк...");
    }
}
