package archiwum;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

/**
 * @author Wojciech Okoński
 *         created on 06.04.2016 r.
 */
public class CallGenerator {

    public static Queue<Call> generateCalls(int numberOfCalls) {
        Queue<Call> calls = new PriorityQueue<>(new StartTimeComparator());
        for (int i = 0; i < numberOfCalls; ++i) {
            calls.offer(new Call(new Random().nextInt(10) + 1, new Random().nextInt(100) + 1, new Random().nextInt(100) + 1));
        }
        return calls;
    }

    public static Queue<Call> generateCalls(int[] array) {
        Queue<Call> calls = new PriorityQueue<>(new StartTimeComparator());
        for (int i = 0; i < array.length; ++i) {
            calls.offer(new Call(0, 0, array[i]));
        }
        return calls;
    }
}
