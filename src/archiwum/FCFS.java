package archiwum;

import java.util.Queue;

/**
 * @author Wojciech Okoński
 *         created on 06.04.2016 r.
 */
public class FCFS extends Algorithm {

    public FCFS(Queue<Call> queue) throws CloneNotSupportedException {
        super(queue);
    }

    @Override
    public int calculate() {
        int sum = 0;
        cylinder = queue.poll().getCylinder();

        while (!queue.isEmpty()) {
            Call call = queue.poll();
            sum += Math.abs(call.getCylinder() - cylinder);
            cylinder = call.getCylinder();
        }

        return sum;
    }
}
