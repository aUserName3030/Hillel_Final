package lessons.ali.Lesson26;

public class Main {
    public static void main(String[] args) {
         Animal animal = new Animal(0);
         Person person = new Person("Adam");
         animal.sleep();
         person.sayHello();
         animal.showInfo();
         person.showInfo();

         Info info0 = new Animal(1);
         Info info1 = new Person("Eve");
         info0.showInfo();
         info1.showInfo();

         outputInfo(info0);
         outputInfo(animal);
    }

    public static void outputInfo(Info info) {
        info.showInfo();
    }
}
