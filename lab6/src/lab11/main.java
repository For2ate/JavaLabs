package lab11;


import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

//var 23
public class main {
    public static void main(String[] args) throws InterruptedException {
        CPUQueue cpuQueue1 = new CPUQueue();
        CPUQueue cpuQueue2 = new CPUQueue();
        CPU cpu1 = new CPU("First queue", cpuQueue1, cpuQueue2);
        CPU cpu2 = new CPU("Second queue", cpuQueue2);
        FillThread fillThread1 = new FillThread(20, 10, 1, cpuQueue1);
        FillThread fillThread2 = new FillThread(15, 10, 2, cpuQueue2);
        Thread fill1 = new Thread(fillThread1);
        Thread fill2 = new Thread(fillThread2);
        Thread cp1 = new Thread(cpu1);
        Thread cp2 = new Thread(cpu2);
        Thread info = new Thread(() -> {while (true) {
            System.out.println(
                    "\n\n\nmax len of first queue is " + cpuQueue1.getMaxLength() +
                    "\nmax len of second queue is " + cpuQueue2.getMaxLength() +
                    "\nBroken procces is " + CPU.cntBreak + "\n\n\n");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        });
        fill1.start();
        fill2.start();
        cp1.start();
        cp2.start();
        info.start();
        try {
            fill1.join();
            fill2.join();
            cp1.join();
            cp2.join();
            info.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
