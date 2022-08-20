package lessons.ali.Lesson20_21;

public class Lesson20 {
    public static void main(String[] args) {
        ModernHuman h1 = new ModernHuman();
        ModernHuman h2 = new ModernHuman("Sam", 29);
        System.out.println(h1.getAvgAge());
        System.out.println(h2);
    }

}


class ModernHuman {

    private String name;
    private int age;

    private static int totalAge = 0;
    private static int totalHumans = 0;

    public ModernHuman() {
        this("Jack",39);
    }

    public ModernHuman(String name, int age) {
        this.name = name;
        this.age = age;
        totalHumans++;
        totalAge += age;
    }

    public int getAvgAge() {
        return totalAge/totalHumans;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Имя этого человека " + name + ", а возраст " + age;
    }
}