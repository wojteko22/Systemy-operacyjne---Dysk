package archiwum;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author Wojciech Okoński
 *         created on 16.03.2016 r.
 */
public abstract class Algorithm {
    protected Queue<Call> queue = new PriorityQueue<>(new StartTimeComparator());
    protected int numberOfCalls;
    protected int cylinder;

    public Algorithm(Queue<Call> queue) throws CloneNotSupportedException {
        for (Call call : queue) {
            this.queue.offer(call.clone());
        }
        numberOfCalls = queue.size();
    }

    abstract public int calculate();

/*    public void printQueue() {
        for (Process process : queue) {
            System.out.println(process);
        }
    }*/
}
