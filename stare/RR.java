/*
import java.util.*;

*/
/**
 * @author Wojciech Okoński
 *         created on 09.03.2016 r.
 *//*

public class RR extends archiwum.Algorithm {
    private int quantum;

    public RR(Queue<Process> queue, int quantumPercentage) throws CloneNotSupportedException {
        this(queue, quantumPercentage, true);
    }

    public RR(Queue<Process> queue, int quantum, boolean quantumIsPercentage) throws CloneNotSupportedException {
        super(queue);
        if (quantumIsPercentage) {
            this.quantum = Math.round(getAverageLength() * quantum / 100);
        } else {
            this.quantum = quantum;
        }
    }

    public float getAverageLength() {
        int sumOfLength = 0;
        for (Process p : queue) {
            sumOfLength += p.getLength();
        }
        return (float) sumOfLength / numberOfProcesses;
    }


    @Override
    public double simulate() {
        int sumOfAwaitingTime = 0, time = 0;

        SortedSet<Process> readyProcesses = new TreeSet<>(new ProcessComparator());

        while (!queue.isEmpty() || !readyProcesses.isEmpty()) {
            while (!queue.isEmpty() && queue.peek().getTimeOfEntry() <= time) {
                readyProcesses.add(queue.poll());
            }
            if (readyProcesses.isEmpty()) {
                time = queue.peek().getTimeOfEntry();
                readyProcesses.add(queue.poll());
            }
            Iterator<Process> readyProcessIterator = readyProcesses.iterator();
            while (readyProcessIterator.hasNext()) {
                Process process = readyProcessIterator.next();
                sumOfAwaitingTime += (time - process.getTimeOfEntry());
                if (process.getLength() <= quantum) {
                    time += process.getLength();
                    readyProcessIterator.remove();
                } else {
                    process.lessQuantumOfTime(quantum);
                    time += quantum;
                    process.setTimeOfEntry(time);
                }
            }
        }
        return (double) sumOfAwaitingTime / numberOfProcesses;
    }
}
*/
