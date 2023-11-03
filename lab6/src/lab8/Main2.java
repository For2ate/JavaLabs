package lab8;

import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        String s = new String("");
        int n = r.nextInt(29) + 4;
        for (int i = 0; i < n; i++) {
            char c[] = new char[r.nextInt(4) + 1];
            for (int j = 0; j < c.length; j++) {
                c[j] = (char) (r.nextInt(28) + 'a');
            }
            String cur = new String(c);
            cur += (i == n - 1 ? "." : ",");
            s += cur;
        }
        System.out.println("Начальная строка:");
        System.out.println(s);
        int lenMx = 0, lenMin = (int)1e9;
        String arr[] = s.split("[^a-zA-Z]+");
        for (String i : arr){
            lenMx = max(lenMx, i.length());
            lenMin = min(lenMin, i.length());
        }
        System.out.println("Минимальная длина - " + lenMin + ", Максимальная длина - " + lenMx);
        if (lenMin == lenMx) {
            System.out.println("Длины совподают, поэтому строки одинаковой длины:");
            for (String i : arr) {
                if (i.length() == lenMx) {
                    System.out.println(i);
                }
            }
        }
        else {
            System.out.println("Строки минимальной длины:");
            for (String i : arr) {
                if (i.length() == lenMin) {
                    System.out.println(i);
                }
            }
            System.out.println("Строки максимальной длины:");
            for (String i : arr) {
                if (i.length() == lenMx) {
                    System.out.println(i);
                }
            }
        }
    }
}
