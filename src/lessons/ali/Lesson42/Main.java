package lessons.ali.Lesson42;

public class Main {
    public static void main(String[] args) {
        int x = 1;
        int y = 1;
        System.out.println(x == y);

        Animal animal = new Animal(1);
        Animal animal1 = new Animal(1);
        System.out.println(animal == animal1);
        System.out.println(animal.equals(animal1));

        String string = "1";
        String string1 = "1";
        System.out.println(string == string1);

        String string2 = new String("1");
        String string3 = new String("1");
        System.out.println(string2 == string3);

        String string4 = "1";
        String string5 = "123".substring(0,1);
        System.out.println(string4 == string5);
    }
}

class Animal {
    private int id;

    public Animal(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        Animal otherAnimal = (Animal) o;
        return this.id == otherAnimal.id;
    }
}