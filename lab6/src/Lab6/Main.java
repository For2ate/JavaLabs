package Lab6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //var 2
        Scanner sc = new Scanner(System.in);
        Plane pl = new Plane();
        pl = Plane.get(sc);
        System.out.println(1);
        while (true) {
            System.out.println("input 1) setRoute, 2) fly, 3) getInfo, 4) exit");
            int n = sc.nextInt();
            switch (n) {
                case 1 -> pl.setRoute(sc);
                case 2 -> pl.fly();
                case 3 -> System.out.println(pl.toStr());
            }
            if (n == 4) {
                break;
            }
        }
    }
}