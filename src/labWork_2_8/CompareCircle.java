package labWork_2_8;

import java.util.Comparator;

/**
 * Created by Bulik on 30.07.2016.
 */
public class CompareCircle implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Circle circle_1 = (Circle)o1;
        Circle circle_2 = (Circle)o2;
        if (circle_1.getRadius() > circle_2.getRadius())
            return -1;
        if (circle_1.getRadius() < circle_2.getRadius())
            return 1;

        return 0;
    }
}
