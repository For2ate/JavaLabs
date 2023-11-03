package lab11;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class CPUQueue {
    private Deque<Procces> dqu = new LinkedList<Procces>();
    public static int maxLength;

    public synchronized void addLast(Procces procces) {
        dqu.addLast(procces);
        maxLength = Math.max(maxLength, getSize());
    }
    public synchronized void addFirst(Procces procces) {
        dqu.addFirst(procces);
        maxLength = Math.max(maxLength, getSize());
    }

    public synchronized Procces getLast() {
        Procces rem = dqu.removeLast();
        return rem;
    }
    public synchronized Procces getFirst() {
        Procces rem = dqu.removeFirst();
        return rem;
    }

    public synchronized int getSize() {
        return dqu.size();
    }
    public int getMaxLength() {
        return maxLength;
    }

}
