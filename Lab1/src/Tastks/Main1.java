package Tastks;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a, b, c : ");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        int cnt = 0;
        if (a > 0) cnt++;
        if (b > 0) cnt++;
        if (c > 0) cnt++;
        System.out.println("Count positive numbers is : " + Integer.toString(cnt));
    }
}
