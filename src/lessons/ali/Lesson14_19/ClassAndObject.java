package lessons.ali.Lesson14_19;

public class ClassAndObject {
    public static void main(String[] args) {
        Person Adam = new Person("Ivan");
        Adam.setNameAgeSex("Mada", 20, true);
        Adam.setName("");
        Adam.setAge(33);
        System.out.println("В начале был создан: " + Adam);

        Adam.sayHello();
        Adam.speak();

        Person Eve = new Person();
        Eve.setNameAgeSex("Eve", 12, false);
        Eve.setName("Lilith");
        Eve.setAge(-99);
        System.out.println("А из его ребра: " + Eve.getName() + " возрастом " + Eve.getAge() + " лет, пол: " +
                Eve.getSex());

        System.out.println(Adam + " Этому человеку осталось " + Adam.calculateYearsToOriginalSin() + " лет " +
                "до первородного греха.");
        System.out.println(Eve + " Этому человеку осталось " + Eve.calculateYearsToOriginalSin() + " лет " +
                "до первородного греха.");

    }
}

class Person {
    private String name;
    private int age;
    private int ageToSin;
    private boolean sex;

    public Person(){
        this.name = "Adam";
        this.age = 0;
        this.sex = true;
    }

    public Person(String name){
        this.name = name;
        this.age = 0;
        this.sex = true;
    }

    public Person(String name, int age){
        this.name = name;
        this.age = age;
        this.sex = true;
    }

    public Person(String name, int age, boolean sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    void speak() {
        System.out.println("Меня зовут " + this.name + ", мне " + this.age + " лет.");
    }

    void sayHello() {
        System.out.println("Hello");
    }

    public void setNameAgeSex(String name, int age, boolean sex) {
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

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Возраст должен быть положительным");
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    public void setName(String name) {
        if (name.isEmpty()) {
            System.out.println("Имя не может быть пустым");
            this.name = "Adam";
        } else {
            this.name = name;
        }
    }

    public void setSex(boolean sex) {
        System.out.println("true - мужчина, false - женщина");
        this.sex = sex;
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
