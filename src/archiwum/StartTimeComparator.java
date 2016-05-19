package archiwum;

import java.util.Comparator;

/**
 * @author Wojciech Okoński
 *         created on 05.03.2016 r.
 */
public class StartTimeComparator implements Comparator<Call> {
    @Override
    public int compare(Call o1, Call o2) {
        if (o1.getStartTime() == o2.getStartTime()) return o1.getID() - o2.getID();
        return o1.getStartTime() - o2.getStartTime();
    }
}

