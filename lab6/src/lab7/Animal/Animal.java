package lab7.Animal;

import java.util.Scanner;

public abstract class Animal {
    private static int countObjects = 0;

    private double height;
    private double length;
    private double weight;

    public static void addCount(){
        countObjects++;
    }

    Animal(double height, double length, double weight) {
        this.height = height;
        this.length = length;
        this.weight = weight;
        addCount();
    }

    Animal() {
        this.weight = this.height = this.length = 0;
    }

    public double getHeight() {
        return this.height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getLength() {
        return this.length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public double getWeight(){
        return this.weight;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }



    @Override
    public abstract boolean equals(Object current);

    @Override
    public String toString(){
        return "Weight - " + this.getWeight() + ", length - " + this.getLength() + ", height - " + this.getHeight();
    }

}
