package lessons.firsttothird.ali;

public class ClassAndObject {
    public static void main(String[] args) {
        Person Adam = new Person();
        Adam.name = "Adam";
        Adam.age = 33;
        System.out.println("В начале был создан: " + Adam);

        Adam.sayHello();
        Adam.speak();

        Person Eve = new Person();
        Eve.name = "Eve";
        Eve.age = 27;
        System.out.println("А из его ребра: " + Eve);

        Eve.sayHello();
        Eve.speak();
    }
}

class Person {
    String name;
    int age;

    void speak () {
        System.out.println("Меня зовут " + this.name + ", мне " + this.age + " лет.");
    }

    void sayHello () {
        System.out.println("Hello");
    }

    @Override
    public String toString() {
        return "Человек {" +
                "Имя: '" + name + '\'' +
                ", Возраст: " + age +
                '}';
    }
}
