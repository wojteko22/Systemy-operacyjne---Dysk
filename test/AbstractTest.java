import archiwum.Call;
import archiwum.CallGenerator;

import java.util.Queue;

/**
 * @author Wojciech Okoński
 *         created on 06.04.2016 r.
 */
public abstract class AbstractTest {
    final Queue<Call> queue;
    final Queue<Call> queue2;

    AbstractTest() {
        queue = CallGenerator.generateCalls(new int[] {50, 95, 180, 34, 119, 11, 123, 62, 64});
        queue2 = CallGenerator.generateCalls(new int[] {143, 86, 1470, 913, 1774, 948, 1509, 1022, 1750, 130});
    }
}
