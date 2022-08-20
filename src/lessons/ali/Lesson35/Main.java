package lessons.ali.Lesson35;

public class Main {
    public static void main(String[] args) {
        AbleToEat animal = new AbleToEat() {
            @Override
            public void eat() {
                System.out.println("Nom-nom...");
            }
        };
        animal.eat();
        //OtherAnimal otherAnimal = new OtherAnimal();
        //otherAnimal.eat();
    }
}

interface AbleToEat {
    public void eat();
}

/*
class Animal implements AbleToEat {
    public void eat() {
        System.out.println("Nom-nom-nom...");
    }
}
*/

/*
class OtherAnimal extends Animal {
    @Override
    public void eat() {
        System.out.println("Nom-nom-nom-nom...");
    }
}
*/