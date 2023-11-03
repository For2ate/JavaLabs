package Lab6;

import java.util.*;

public class Engine {

    private int number;
    private double power;

    Engine(int number, double power) {
        this.number = number;
        this.power = power;
    }

    public static Engine get(Scanner sc) {
        Engine current = new Engine(0, 0);
        System.out.println("Input number of engine: ");
        current.number = sc.nextInt();
        System.out.println("Input power of engine: ");
        current.power = sc.nextDouble();
        return current;
    }

    public String getStr() {
        String current = "engin: " + number + ", power: " + power;
        return  current;
    }

}
