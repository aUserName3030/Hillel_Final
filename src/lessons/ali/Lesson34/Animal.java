package lessons.ali.Lesson34;

public class Animal {
    private int id;

    public Animal(int id) {
        this.id = id;
    }

    public void eat() {
        System.out.println("Nom-nom-nom...");
    }

    @Override
    public String toString() {
        return String.valueOf(id);
    }
}
