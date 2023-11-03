package Lab6;

import java.util.Scanner;

public class Plane {
    private Wing[] wings;
    private Shassi shassi;
    private Engine engine;
    private String brand;
    private double route;
    private double v;
    private String nameOfPunct;

    Plane(String brand, Shassi shassi, Engine engine, Wing[] wings, double route, double v, String nameOfPunct) {
        this.brand = brand;
        this.shassi = shassi;
        this.engine = engine;
        this.wings = wings;
        this.route = route;
        this.v = v;
        this.nameOfPunct = nameOfPunct;
    }
    Plane() {
        this.brand = "";
        this.shassi = new Shassi(0, Shassi.Type.Wheel);
        this.engine =  new Engine(0,0f);
        this.wings = new Wing[2];
        this.route = 0;
        this.v = 0;
        this.nameOfPunct = "";
    }

    public String toStr() {
        String current = brand + "; " + engine.getStr() + shassi.getStr();
        for (int i = 0; i < 2; i++) {
            current += wings[i].getStr();
        }
        current += "route is[" + route + "km, speed " + v + ", name of final punct " + nameOfPunct + "]";
        return current;
    }

    public static Plane get(Scanner sc) {
        Plane current = new Plane("", new Shassi(0, Shassi.Type.Wheel), new Engine(0,0f), new Wing[2], 0, 0, "");
        System.out.println("input name of brand");
        current.brand = sc.next();
        current.shassi = Shassi.get(sc);
        current.engine = Engine.get(sc);
        for (int i = 0; i < 2; i++) {
            current.wings[i] = Wing.get(sc);
        }
        System.out.println("input distance, speed of plane, name of final punct");
        current.route = sc.nextDouble();
        current.v = sc.nextDouble();
        current.nameOfPunct = sc.next();
        return current;
    }

    public void fly() {
        if (this.route <= 0) {
            System.out.println("the plane has arrived at its destination");
            return;
        }
        if (wings[0].getSize() != wings[1].getSize()) {
            System.out.println("the flight is not possible");
            return;
        }
        System.out.println("time the flight is " + (route / v) + " u are welcome in " + nameOfPunct);
    }

    public void setRoute(Scanner sc) {
        System.out.println("input length of route, speed, name of final punct");
        this.route = sc.nextDouble();
        this.v = sc.nextDouble();
        this.nameOfPunct = sc.next();
    }

}
