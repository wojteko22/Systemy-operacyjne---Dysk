package archiwum;

import java.util.Queue;

/**
 * @author Wojciech Okoński
 *         created on 07.04.2016 r.
 */
public class SSTF extends Algorithm {

    public SSTF(Queue<Call> queue) throws CloneNotSupportedException {
        super(queue);
    }

    @Override
    public int calculate() {
        int time = 0;
        Call first = queue.poll();
        cylinder = first.getCylinder();
        time = first.getStartTime();






        return 0;
    }


}
