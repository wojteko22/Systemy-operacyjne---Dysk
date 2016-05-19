package oneMethod;

import java.util.Queue;

/**
 * @author Wojciech Okoński
 *         created on 11.04.2016 r.
 */
public class Simulator {
    private final int discSize;
    private final int startCylinder;
    private final int numberOfCalls;
    private final int numberOfQueues;

    private Simulator(int discSize, int startCylinder, int numberOfCalls, int numberOfQueues) {
        this.discSize = discSize;
        this.startCylinder = startCylinder;
        this.numberOfCalls = numberOfCalls;
        this.numberOfQueues = numberOfQueues;
    }

    private void simulate() throws CloneNotSupportedException {
        int FCFS = 0, CSCAN = 0, SCAN = 0, SSTF = 0;

        for (int i = 0; i < numberOfQueues; i++) {
            Queue<Call> queue = CallGenerator.generateCalls(discSize, numberOfCalls);
            FCFS += new Counter(queue, FCFSComparator.INSTANCE, startCylinder).calculate();
            SSTF += new Counter(queue, new SSTFComparator(startCylinder, queue), startCylinder).calculate();
            SCAN += new Counter(queue, new SCANComparator(startCylinder, discSize), startCylinder).calculate();
            CSCAN += new Counter(queue, new CSCANComparator(startCylinder, discSize), startCylinder).calculate();
        }
        System.out.println("FCFS\t" + (double) FCFS / numberOfQueues);
        System.out.println("SSTF\t" + (double) SSTF / numberOfQueues);
        System.out.println("SCAN\t" + (double) SCAN / numberOfQueues);
        System.out.println("C-SCAN\t" + (double) CSCAN / numberOfQueues);
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        new Simulator(100, 50, 20, 50).simulate();
    }


}
