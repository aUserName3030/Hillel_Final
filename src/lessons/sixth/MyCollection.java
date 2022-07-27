package lessons.sixth;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class MyCollection {
    public static void main(String[] args) {
        Collection<Car> carCollection = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            carCollection.add(new Car(100+i*10,"BMW-" + (i + 1)));
        }

        Iterator<Car> iterator = carCollection.iterator();

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("\n");

        Car[] cars = carCollection.toArray(new Car[carCollection.size()]);

        Arrays.sort(cars);

        for(Car c: cars) {
            System.out.println(c);
        }
        System.out.println("\n");

        Arrays.sort(cars, new MyCorporator());

        for(Car c: cars) {
            System.out.println(c);
        }

    }
}
