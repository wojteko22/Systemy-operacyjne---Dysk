package oneMethod;

import java.util.Comparator;

/**
 * @author Wojciech Okoński
 *         created on 07.04.2016 r.
 */
class CylinderComparator implements Comparator<Call> {
    static final CylinderComparator INSTANCE = new CylinderComparator();

    private CylinderComparator() {
    }

    @Override
    public int compare(Call o1, Call o2) {
        return o1.getCylinder() - o2.getCylinder();
    }
}
