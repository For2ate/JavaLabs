package Lab6;

import java.util.Scanner;

public class Wing {
    private double size;

    Wing(double size) {
        this.size = size;
    }

    public String getStr() {
        String current = "Size of wing: " + size;
        return current;
    }

    public double getSize(){
        return this.size;
    }

    public static Wing get(Scanner sc){
        Wing current = new Wing(0);
        System.out.println("input size of wing");
        current.size = sc.nextDouble();
        return current;
    }
}
