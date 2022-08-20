package lessons.ali.Lesson48;

public enum Season {
    SPRING(20),SUMMER(40),FALL(10),WINTER(-10);

    private int temperature;

    Season(int temperature) {
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }
}
