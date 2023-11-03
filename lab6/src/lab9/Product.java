package lab9;

import java.util.Random;
import java.util.Scanner;

public class Product {
    private String name;
    private int cnt;
    private int numer;

    Product() {
        this.name = "";
        this.cnt = this.numer = 0;
    }

    Product(String name, int cnt, int numer) {
        this.name = name;
        this.cnt = cnt;
        this.numer = numer;
    }

    public static Product init() {
        Random rnd = new Random();
        Product current = new Product();
        String currName = "";
        for (int i = 0; i < 3; i++) {
            currName += (char)(rnd.nextInt(26) + 'a');
        }
        current.name = currName;
        current.numer = rnd.nextInt(4) + 1;
        current.cnt = rnd.nextInt(99) + 1;
        return current;
    }

    public static Product init(Scanner sc) {
        Product current = new Product();
        System.out.println("input name of product");
        current.name = sc.next();
        System.out.println("input count of product");
        current.cnt = sc.nextInt();
        System.out.println("input numer of product");
        current.numer = sc.nextInt();
        return current;
    }


    String to_String() {
        return "№:" + this.numer + ", name of product - " + this.name + ", count of product - " + this.cnt;
    }

    public String getName() {
        return this.name;
    }
    public int getCnt() {
        return this.cnt;
    }
    public int getNumer() {
        return  this.numer;
    }

}
