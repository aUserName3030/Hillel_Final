package lessons.ali.Lesson48;

public enum Animal {
    DOG(1),CAT(2),FROG(3);

    private int id;

    private Animal (int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "id = " + id;
    }
}
