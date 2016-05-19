package archiwum;

import java.util.Queue;

/**
 * @author Wojciech Okoński
 *         created on 06.04.2016 r.
 */
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Queue<Call> queue1 = CallGenerator.generateCalls(10);
        System.out.println("archiwum.FCFS: " + new FCFS(queue1).calculate());
    }
}
