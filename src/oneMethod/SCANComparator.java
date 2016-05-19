package oneMethod;

import java.util.Comparator;

/**
 * @author Wojciech Okoński
 *         created on 11.04.2016 r.
 */
class SCANComparator implements Comparator<Call> {
    private final int startCylinder;
    private final int discSize;

    SCANComparator(int startCylinder, int discSize) {
        this.startCylinder = startCylinder;
        this.discSize = discSize;
    }

    @Override
    public int compare(Call o1, Call o2) {
        if (o1.getCylinder() < startCylinder) o1.increaseCylinder(2 * (discSize - 1 - o1.getCylinder()));
        if (o2.getCylinder() < startCylinder) o2.increaseCylinder(2 * (discSize - 1 - o2.getCylinder()));
        return o1.getCylinder() - o2.getCylinder();
    }
}
