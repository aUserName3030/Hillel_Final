package lessons.ali.Lesson43;

public class Electrocar {
    private int id;

    private class Engine {
        public void startEngine() {
            System.out.println("Du-ra-ra-ra-ra-ra...");
        }
    }

    public static class Battery {
        public void chardge() {
            System.out.println("Zip-zip-zip-zap...");
        }
    }

    public Electrocar(int id) {
        this.id = id;
    }

    public void start() {
        Engine engine = new Engine();
        engine.startEngine();

        final int x = 1;

        class SomeClass {
            public void someMethod() {
                System.out.println(x);
                System.out.println(id);
            }
        }

        SomeClass someClass = new SomeClass();

        System.out.println("Car start to move...");
    }

    private void Test(Object object) {

    }
}
