package lab11;

import java.security.PrivateKey;
import java.util.Deque;
import java.util.Queue;
import java.util.Random;

public class FillThread  implements Runnable{

    private CPUQueue dqu = new CPUQueue();
    private int max, min, num;

    public FillThread(int max, int min, int num, CPUQueue cpuQueue) {
        this.max = max;
        this.min = min;
        this.num = num;
        this.dqu = cpuQueue;
    }

    public void run() {
        while (true) {
            Procces procces = new Procces(min, max);
            dqu.addLast(procces);
            System.out.println("Add procces in " + num + " queue");
            try {
                Thread.sleep(procces.getTime() + 5);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
