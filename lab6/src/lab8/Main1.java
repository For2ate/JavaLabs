package lab8;

import java.util.Random;
import java.util.Scanner;
import java.util.SimpleTimeZone;

//lab10 - 21,  lab11 - 23

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        String s = new String("");
        int n = r.nextInt(29) + 1;
        for (int i = 0; i < n; i++) {
            char c[] = new char[r.nextInt(4) + 1];
            for (int j = 0; j < c.length; j++) {
                c[j] = (char)(r.nextInt(26) + 'a');
            }
            String cur = new String(c);
            cur += (i == n - 1 ? "." : ",");
            s+=cur;
        }
        System.out.println("Начальная строка:");
        System.out.println(s);
        String arr[] = s.split(",");
        arr[arr.length - 1] = arr[arr.length - 1].substring(0, arr[arr.length - 1].length() - 1);
        String out = new String("");
        for (int i = 0; i < arr.length; i++) {
            boolean check = true;
            for (int j = 0; j < i; j++) {
                if (arr[j].equals(arr[i]) == true) {
                    check = false;
                }
            }
            if (check == true) {
                out += arr[i] + ",";
            }
        }
        out = out.substring(0, out.length() - 1) + ".";
        System.out.println("Финальная строка:");
        System.out.println(out);
    }
}
