package oneMethod;

import java.util.*;

/**
 * @author Wojciech Okoński
 *         created on 11.04.2016 r.
 */
class SSTFComparator implements Comparator<Call> {
    private final int startCylinder;
    private final List<Integer> list;
    private final Queue<Call> queue = new PriorityQueue<>();
    private final Queue<Call> rightQueue = new PriorityQueue<>(CylinderComparator.INSTANCE);
    private final Queue<Call> leftQueue = new PriorityQueue<>(Collections.reverseOrder(CylinderComparator.INSTANCE));

    SSTFComparator(int startCylinder, Queue<Call> primaryQueue) throws CloneNotSupportedException {
        this.startCylinder = startCylinder;
        list = new ArrayList<>(primaryQueue.size());
        for (Call call : primaryQueue) {
            queue.offer(call.clone());
        }
        orderCalls();
    }

    private void orderCalls() {
        while (!queue.isEmpty()) {
            if (queue.peek().getCylinder() > startCylinder) rightQueue.add(queue.poll());
            else leftQueue.add(queue.poll());
        }
        while (!leftQueue.isEmpty() || !rightQueue.isEmpty()) {
            if (leftQueue.isEmpty()) {
                while (!rightQueue.isEmpty()) {
                    list.add(rightQueue.poll().getCylinder());
                }
            } else if (rightQueue.isEmpty()) {
                while (!leftQueue.isEmpty()) {
                    list.add(leftQueue.poll().getCylinder());
                }
            } else if (Math.abs(startCylinder - rightQueue.peek().getCylinder()) <= Math.abs(startCylinder - leftQueue.peek().getCylinder())) {
                list.add(rightQueue.poll().getCylinder());
            } else list.add(leftQueue.poll().getCylinder());
        }
    }

    @Override
    public int compare(Call o1, Call o2) {
        return list.indexOf(o1.getCylinder()) - list.indexOf(o2.getCylinder());
    }
}
