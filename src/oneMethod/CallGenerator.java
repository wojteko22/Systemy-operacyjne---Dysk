package oneMethod;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

/**
 * @author Wojciech Okoński
 *         created on 06.04.2016 r.
 */
class CallGenerator {
    static Queue<Call> generateCalls(int discSize, int numberOfCalls) {
        Queue<Call> calls = new PriorityQueue<>();
        for (int i = 0; i < numberOfCalls; ++i) {
            calls.offer(new Call(new Random().nextInt(discSize)));
        }
        return calls;
    }
}
