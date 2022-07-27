package lessons.sixth;

public class Car implements Comparable{

    private int speed;
    private String model;

    public Car(int speed, String model) {
        this.speed = speed;
        this.model = model;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car is " + this.model + " with speed of " + this.speed + " mph.";
    }

    @Override
    public int compareTo(Object o) {
        if (speed < ((Car)o).speed) {
            return 1;
        } else if (speed > ((Car)o).speed) {
            return -1;
        }
        return 0;
    }
}
