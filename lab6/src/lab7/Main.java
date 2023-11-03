package lab7;

import lab7.Animal.Artiodactyl;
import lab7.Animal.Bird;
import lab7.Animal.Mammals;

import java.util.Scanner;
import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bird bd = new Bird();
        bd = Bird.init(sc);
        System.out.println(bd.toString());
        Mammals ml = new Mammals();
        ml = Mammals.init(sc);
        System.out.println(bd.toString());
        Mammals cur1 = new Artiodactyl(), cur2 = new Artiodactyl();
        cur1 = Artiodactyl.init(sc);
        cur2 = Artiodactyl.init(sc);
        System.out.println(cur1.toString());
        System.out.println(cur2.toString());
        System.out.println(cur1.equals(cur2));
    }
}
// lab8 - 13 lab9 - 25