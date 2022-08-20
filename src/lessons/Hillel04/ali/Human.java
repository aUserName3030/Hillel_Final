package lessons.Hillel04.ali;

public class Human {
    private String name;
    private int age;

    public Human(){
        this.name = "Адам";
        this.age = 33;
    }

    public Human(String name) {
        this.name = name;
        System.out.println("Введённное имя: " + this.name);
    }

    public Human(int age) {
        this.age = age;
        System.out.println("Введённный возраст: " + this.age);
    }

    public Human(String name, int age) {
        this.age = age;
        this.name = name;
        System.out.println("Введённное имя: " + this.name + ". Введённный возраст: " + this.age);
    }
}

class Main {
    public static void main(String[] args) {
        Human human1 = new Human();
        Human human2 = new Human("Иллия");
        Human human3 = new Human(90);
        Human human4 = new Human("Даздранаргон", 32);
    }
}