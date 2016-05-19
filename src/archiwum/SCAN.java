package archiwum;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author Wojciech Okoński
 *         created on 07.04.2016 r.
 */
public class SCAN extends Algorithm {
    private final int end;
    private int time = 0;
    private final Queue<Call> rightQueue = new PriorityQueue<>(new CylinderComparator());
    private final Queue<Call> leftQueue = new PriorityQueue<>(new ReverseCylinderComparator());
    private boolean isRight = true;

    public SCAN(Queue<Call> queue, int end) throws CloneNotSupportedException {
        super(queue);
        this.end = end;
    }

    @Override
    public int calculate() {
        Call first = queue.poll();
        cylinder = first.getCylinder();
        time = first.getStartTime();




        return 0;
    }

    private void getReadyCalls() {
        while(queue.peek().getStartTime() <= time) {
            if(isRight) {

            }
            else {

            }
        }


    }
}
