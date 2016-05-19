package oneMethod;

import java.util.Comparator;

/**
 * @author Wojciech Okoński
 *         created on 11.04.2016 r.
 */
class FCFSComparator implements Comparator<Call> {
    static final FCFSComparator INSTANCE = new FCFSComparator();

    private FCFSComparator() {
    }

    @Override
    public int compare(Call o1, Call o2) {
        return o1.getID() - o2.getID();
    }
}
