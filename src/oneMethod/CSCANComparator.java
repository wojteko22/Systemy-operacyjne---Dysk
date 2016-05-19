package oneMethod;

import java.util.Comparator;

/**
 * @author Wojciech Okoński
 *         created on 11.04.2016 r.
 */
class CSCANComparator implements Comparator<Call> {
    private final int startCylinder;
    private final int discSize;

    CSCANComparator(int startCylinder, int discSize) {
        this.startCylinder = startCylinder;
        this.discSize = discSize;
    }

    @Override
    public int compare(Call o1, Call o2) {
        if (o1.getCylinder() < startCylinder) o1.increaseCylinder(discSize - 1);
        if (o2.getCylinder() < startCylinder) o2.increaseCylinder(discSize - 1);
        return o1.getCylinder() - o2.getCylinder();
    }
}
