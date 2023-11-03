import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //var 18
        Scanner sc = new Scanner(System.in);
        System.out.println("Input N : ");
        int n = sc.nextInt();
        int pw = 1, ans = 0;
        for (int i = 1; i < 100000; i++) {
            pw = 1; ans = i;
            int cur = i;
            while (cur > 0) {
                pw *= cur%10;
                cur/=10;
            }
            if (pw == n && i != n) {
                break;
            }
        }
        System.out.println(pw == n ? ans : "never");
    }
}