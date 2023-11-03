package lab7.Animal;

import java.util.Scanner;

public class Mammals extends Animal {
    private int cntPaws;
    public enum Type {Warm_blooded, Cold_blooded};
    private Type blood;

    public Mammals(double height, double length, double weight, int cntPaws, Type blood){
        super(height,length,weight);
        this.cntPaws = cntPaws;
        this.blood = blood;
    }

    public Mammals(){
        super(0f,0f,0f);
        this.cntPaws =0;
        this.blood = Type.Cold_blooded;
    }

    public int getCntPaws() {
        return this.cntPaws;
    }
    public Type getBlood() {
        return this.blood;
    }

    public void setCntPaws(int cntPaws){
        this.cntPaws = cntPaws;
    }
    public void setBlood(Type blood) {
        this.blood = blood;
    }


    public static Mammals init(Scanner sc) {
        Mammals current = new Mammals();
        System.out.println("input weight, height, length:");
        current.setWeight(sc.nextDouble());
        current.setHeight(sc.nextDouble());
        current.setLength(sc.nextDouble());
        System.out.println("input count of paws:");
        current.setCntPaws(sc.nextInt());
        int x = 0;
        System.out.println("input 1 to set warm-blooded, 2 to set cold-blooded");
        do {
            x = sc.nextInt();
            if (x == 1) {
                current.setBlood(Type.Warm_blooded);
            }
            else if (x == 2) {
                current.setBlood(Type.Cold_blooded);
            }
            else {
                System.out.println("incorrect input, try again");
            }
        }while (!(x > 0 && x < 3));
        return current;
    }

    @Override
    public String toString(){
        return super.toString() + ", count paws " + this.getCntPaws() + ", type of blood " + this.getBlood();
    }
    @Override
    public boolean equals(Object obj){
        if (!(obj instanceof Mammals)) {
            return false;
        }
        Mammals current =  (Mammals) obj;
        return (current.getBlood() == this.getBlood() & current.getHeight() == this.getHeight()
                & current.getWeight() == this.getWeight() & current.getLength() == this.getLength()
                & current.getCntPaws() == this.getCntPaws());
    }

}
