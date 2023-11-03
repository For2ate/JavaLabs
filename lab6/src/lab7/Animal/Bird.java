package lab7.Animal;

import java.util.Scanner;

public class Bird extends Animal {
    private String nameOfBird;
    private double densityOfPlumage;

    public Bird(double height, double length, double weight, String nameOfBird, double densityOfPlumage){
        super(height,length,weight);
        this.nameOfBird = nameOfBird;
        this.densityOfPlumage = densityOfPlumage;
    }

    public Bird(){
        super(0f,0f,0f);
        this.nameOfBird = "";
        this.densityOfPlumage = 0f;
    }

    public String getNameOfBird(){
        return this.nameOfBird;
    }
    public void setNameOfBird(String name){
        this.nameOfBird = name;
    }
    public double getDensityOfPlumage(){
        return this.densityOfPlumage;
    }
    public void setDensityOfPlumage(double densityOfPlumage){
        this.densityOfPlumage = densityOfPlumage;
    }

    public static Bird init(Scanner sc) {
        Bird current = new Bird();
        System.out.println("input weight, height, length:");
        current.setWeight(sc.nextDouble());
        current.setHeight(sc.nextDouble());
        current.setLength(sc.nextDouble());
        System.out.println("input name of bird:");
        current.setNameOfBird(sc.next());
        System.out.println("input density of plumage:");
        current.setDensityOfPlumage(sc.nextDouble());
        return current;
    }

    @Override
    public String toString(){
        return super.toString() + ", name bird " + this.getNameOfBird() + ", density " + this.getDensityOfPlumage();
    }
    @Override
    public boolean equals(Object obj){
        if (!(obj instanceof Bird)) {
            return false;
        }
        Bird current =  (Bird) obj;
        return (current.getHeight() == this.getHeight() & current.getWeight() == this.getWeight()
                & current.getLength() == this.getLength() & this.equals(current)
                & current.getDensityOfPlumage() == this.getDensityOfPlumage()
                & current.getNameOfBird().equals(this.getNameOfBird()));
    }


}
