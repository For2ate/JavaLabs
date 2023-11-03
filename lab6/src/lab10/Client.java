package lab10;

import java.util.Random;
import java.util.Scanner;

public class Client {
    private String name;
    private int basicCost, socCost, countMonth;

    Client(String name, int basicCost, int socCost, int countMonth) {
        this.name = name;
        this.basicCost = basicCost;
        this.socCost = socCost;
        this.countMonth = countMonth;
    }
    Client() {
        this.name = "";
        this.basicCost = this.countMonth = this.socCost = 0;
    }

    public void setBasicCost(int basicCost) {
        this.basicCost = basicCost;
    }

    public void setCountMonth(int countMonth) {
        this.countMonth = countMonth;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSocCost(int socCost) {
        this.socCost = socCost;
    }

    public int getBasicCost() {
        return basicCost;
    }

    public int getCountMonth() {
        return countMonth;
    }

    public int getSocCost() {
        return socCost;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + "|" + basicCost + "|" + socCost + "|" + countMonth + "\n";
    }

    public static Client init() {
        Random rnd = new Random();
        Client curr = new Client();
        String currName = "";
        for (int i = 0; i < 5; i++) {
            currName += (char)(rnd.nextInt(26) + 'a');
        }
        curr.name = currName;
        curr.basicCost = rnd.nextInt(100) + 1;
        curr.socCost = rnd.nextInt(100) + curr.basicCost;
        curr.countMonth = rnd.nextInt(20) + 1;
        return curr;
    }

    public static Client init(Scanner sc) {
        Client curr = new Client();
        System.out.println("input name:");
        curr.name = sc.next();
        System.out.println("input basic cost");
        curr.basicCost = sc.nextInt();
        System.out.println("input social cost");
        curr.socCost = sc.nextInt();
        System.out.println("input count of month");
        curr.countMonth = sc.nextInt();
        return curr;
    }

}
