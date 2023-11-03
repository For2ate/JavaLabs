package lab11;

import javax.swing.plaf.TableHeaderUI;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class CPU implements Runnable {

    private CPUQueue dqu1 = new CPUQueue();
    private CPUQueue dqu2 = new CPUQueue();

    public static int cntBreak = 0;

    private String name;
    private boolean flag;

    public CPU(String name, CPUQueue dqu1) {
        this.name = name;
        this.dqu1 = dqu1;
        flag = false;
    }
    public CPU(String name, CPUQueue dq1, CPUQueue dq2) {
        this.name = name;
        this.dqu1 = dq1;
        this.dqu2 = dq2;
        flag = true;
    }

    public void run() {
        if (flag == false) {
            operateOne();
        }else {
            operateTwo();
        }
    }

    public void operateOne() {
        while (true) {
            if (dqu1.getSize() == 0) {
                try {
                    Thread.sleep(20);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                System.out.println(1);
                operation(dqu1, false);
            }
        }
    }

    public void operateTwo() {
        while (true) {
            if(dqu1.getSize() > 0) {
                operation(dqu1, false);
            } else if(dqu2.getSize() > 0) {
                operation(dqu2, true);
            } else {
                try {
                    Thread.sleep(20);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void operation(CPUQueue cpq, boolean is_breaker) {
        Procces procces = cpq.getFirst();
        try {
            Thread.sleep(procces.getTime());
            if (is_breaker == false) {
                System.out.println("Procces is accept from " + name + " " + (cpq.getSize() + 1));
            } else {
                if (dqu1.getSize() > 0) {
                    cpq.addFirst(procces);
                    cntBreak++;
                } else {
                    System.out.println("Procces is accept from " + name + " " + (cpq.getSize() + 1));
                }
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
