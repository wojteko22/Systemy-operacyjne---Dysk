package oneMethod;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author Wojciech Okoński
 *         created on 11.04.2016 r.
 */
class Counter {
    private final Queue<Call> queue;
    private int currentCylinder;

    Counter(Queue<Call> primaryQueue, Comparator<Call> comparator, int currentCylinder) throws CloneNotSupportedException {
        queue = new PriorityQueue<>(comparator);
        this.currentCylinder = currentCylinder;
        for (Call call : primaryQueue) {
            queue.offer(call.clone());
        }
    }

    int calculate() {
        int sum = 0;

        while (!queue.isEmpty()) {
            int nextCylinder = queue.poll().getCylinder();
            sum += Math.abs(currentCylinder - nextCylinder);
            currentCylinder = nextCylinder;
        }
        return sum;
    }
}
