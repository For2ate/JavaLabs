package Lab6;

import java.util.Scanner;

public class Shassi {
    public enum Type {Wheel, Ski, Float};
    private Type type;
    private double powerBrakes;
    Shassi(double power, Type type) {
        this.powerBrakes = power;
        this.type = type;
    }

    public String  getStr() {
        String current = "Type of chassi" + type + ", power of brakes" + powerBrakes;
        return current;
    }

    public static Shassi get(Scanner sc) {
        Shassi current = new Shassi(0, Type.Float);
        System.out.println("input power of brakes : ");
        current.powerBrakes = sc.nextDouble();
        System.out.println("Input type of shassi: 1) wheel, 2) ski, 3) float");
        while (true) {
            int val = sc.nextInt();
            if (val == 1) {
                current.type = Type.Wheel;
                break;
            }
            if (val == 2) {
                current.type = Type.Ski;
                break;
            }
            if (val == 3) {
                current.type = Type.Float;
                break;
            }
            System.out.println("u input incorrect value try again");
        }
        return current;
    }

}
