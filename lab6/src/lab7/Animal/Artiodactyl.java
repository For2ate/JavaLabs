package lab7.Animal;

import java.util.Scanner;

public class Artiodactyl extends Mammals {
    private String name;
    private boolean haveRogs;

    public Artiodactyl(double height, double length, double weight, int cntPaws, Type blood, String name, boolean haveRogs){
        super(height,length,weight, cntPaws, blood);
        this.name = name;
        this.haveRogs = haveRogs;
    }

    public Artiodactyl(){
        super(0,0,0, 0, Type.Cold_blooded);
        this.name = "";
        this.haveRogs = false;
    }

    public String getName() {
        return this.name;
    }
    public void  setName(String name) {
        this.name = name;
    }

    public void setHaveRogs(boolean haveRogs){
        this.haveRogs = haveRogs;
    }

    public boolean getHaveRogs(){
        return this.haveRogs;
    }
    public String getHaveRogs(boolean haveRogs) {
        if (haveRogs == false) {
            return "haven't any rogs";
        } else {
            return "have rogs";
        }
    }


    public static Artiodactyl init(Scanner sc) {
        Artiodactyl current = new Artiodactyl();
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
        System.out.println("input name of animal:");
        current.setName(sc.next());
        System.out.println("input 0 if animal hasn't rog or 1 if animal has");
        do {
            x = sc.nextInt();
            if (x == 1){
                current.setHaveRogs(true);
            }
            else if (x == 0){
                current.setHaveRogs(false);
            }
            else {
                System.out.println("incorrect input, try again");
            }
        }while (!(x == 0 || x == 1));
        return current;
    }

    @Override
    public String toString(){
        return super.toString() + ", " + this.getHaveRogs(this.getHaveRogs()) + ", this name is " + this.getName();
    }
    @Override
    public boolean equals(Object obj){
        if (!(obj instanceof Artiodactyl)) {
            return false;
        }
        Artiodactyl current =  (Artiodactyl) obj;
        return (current.getBlood() == this.getBlood() & current.getHeight() == this.getHeight()
                & current.getWeight() == this.getWeight() & current.getLength() == this.getLength()
                & current.getCntPaws() == this.getCntPaws()) &
                (current.getHaveRogs() == this.getHaveRogs()) &
                (current.getName().equals(this.getName()));
    }

}
