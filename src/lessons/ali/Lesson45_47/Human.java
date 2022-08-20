package lessons.ali.Lesson45_47;

import java.io.Serializable;

public class Human implements Serializable {

    private static final long serialVersionUID = 2167511090881339262L;

    private transient int id;
    private String personName;
    private int age;
    private boolean sex;

    public Human(int id, String name) {
        this.id = id;
        this.personName = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return personName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.personName = name;
    }

    @Override
    public String toString() {
        return "id=" + id + ", name=" + personName;
    }
}
