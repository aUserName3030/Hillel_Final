package lessons.forth.ali;

public class ClassAndObject {
    public static void main(String[] args) {
        Person Adam = new Person();
        Adam.setNameAgeSex("Adam", 20, true);
        System.out.println("В начале был создан: " + Adam);

        Adam.sayHello();
        Adam.speak();

        Person Eve = new Person();
        Eve.setNameAgeSex("Eve", 12, false);
        System.out.println("А из его ребра: " + Eve.getName() + " возрастом " + Eve.getAge() + "лет, пол: " +
                Eve.getSex());

        System.out.println("Этому человеку осталось " + Adam.calculateYearsToOriginalSin() + " лет " +
                "до первородного греха.");
        System.out.println("Этому человеку осталось " + Eve.calculateYearsToOriginalSin() + " лет " +
                "до первородного греха.");

    }
}

class Person {
    private String name;
    private int age;
    private int ageToSin;
    private boolean sex;

    void speak () {
        System.out.println("Меня зовут " + this.name + ", мне " + this.age + " лет.");
    }

    void sayHello () {
        System.out.println("Hello");
    }

    public void setNameAgeSex (String name, int age, boolean sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public boolean getSex() {
        return sex;
    }

    int calculateYearsToOriginalSin() {
        if (sex) {
            this.ageToSin = 33 - age;
        } else {
            this.ageToSin = 27 - age;
        }
        return ageToSin;
    }

    @Override
    public String toString() {
        return "Человек {" +
                "Имя: '" + name + '\'' +
                ", Возраст: " + age +
                '}';
    }
}
