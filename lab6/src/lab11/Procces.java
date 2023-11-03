package lab11;

import java.util.Random;

public class Procces {
    private  int time;
    public Procces(int min, int max) {
        this.time = (new Random()).nextInt(min, max);
    }
    public int getTime() {
        return time;
    }
}
