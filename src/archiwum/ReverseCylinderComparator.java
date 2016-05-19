package archiwum;

import java.util.Comparator;

/**
 * @author Wojciech Okoński
 *         created on 07.04.2016 r.
 */
public class ReverseCylinderComparator implements Comparator<Call> {
    @Override
    public int compare(Call o1, Call o2) {
        if (o1.getCylinder() == o2.getCylinder()) return o1.getID() - o2.getID();
        return o2.getCylinder() - o1.getCylinder();
    }
}
