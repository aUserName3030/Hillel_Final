package lessons.sixth;

import java.util.Comparator;

public class MyCorporator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        return ((Car)o1).getSpeed() - ((Car)o2).getSpeed();
    }
}
