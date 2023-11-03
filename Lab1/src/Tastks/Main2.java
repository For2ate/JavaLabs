package Tastks;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input x : ");
        double x = sc.nextDouble();
        double a = 1.2, b = 7.2, e = Math.exp(1.0f), z = Math.pow(e, x);
        System.out.println("Test case 1 : a == " + a + ", b == " + b + ", z == " + z);
        if (x < Math.pow(a, 3)) {
            double cur = a * Math.pow(Math.sin(x), 2) + b * Math.cos(z * x + a);
            System.out.println("y == " + Double.toString(cur));
        } else if (Math.pow(a, 3) <= x && x <= b) {
            double cur = Math.pow(a + b * x, 2) - Math.sin(a + z * x);
            System.out.println("y == " + Double.toString(cur));
        }else {
            double cur = Math.sqrt(x - Math.sin(b * x + z));
            System.out.println("y == " + Double.toString(cur));
        }
        a = -1.5; b = 3.2; z = Math.pow(e, 2 * x);
        System.out.println("Test case 2 : a == " + a + ", b == " + b + ", z == " + z);
        if (x < Math.pow(a, 3)) {
            double cur = a * Math.pow(Math.sin(x), 2) + b * Math.cos(z * x + a);
            System.out.println("y == " + cur);
        } else if (Math.pow(a, 3) <= x && x <= b) {
            double cur = Math.pow(a + b * x, 2) - Math.sin(a + z * x);
            System.out.println("y == " + cur);
        }else {
            double cur = Math.sqrt(x - Math.sin(b * x + z));
            System.out.println("y == " + cur);
        }
        a = 1.7; b = 5.5; z = Math.pow(e, 3);
        System.out.println("Test case 3 : a == " + a + ", b == " + b + ", z == " + z);
        if (x < Math.pow(a, 3)) {
            double cur = a * Math.pow(Math.sin(x), 2) + b * Math.cos(z * x + a);
            System.out.println("y == " + cur);
        } else if (Math.pow(a, 3) <= x && x <= b) {
            double cur = Math.pow(a + b * x, 2) - Math.sin(a + z * x);
            System.out.println("y == " + cur);
        }else {
            double cur = Math.sqrt(x - Math.sin(b * x + z));
            System.out.println("y == " + cur);
        }
    }
}
