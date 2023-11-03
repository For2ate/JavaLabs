import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main1 {

    public  static boolean solve(int arr[][], int n) {
        boolean flag = true;
        for (int i = 0; i < n; i++) {
            int curStr[] = new int[n + 1], curSlb[] = new int[n + 1];
            for (int j = 0; j < n; j++) {
                if (arr[i][j] > n || arr[j][i] > n) {
                    flag = false;
                    break;
                }
                curStr[arr[i][j]]++;
                curSlb[arr[j][i]]++;
            }
            for (int j = 1; j <= n; j++) {
                if (curSlb[j] == 0 || curStr[j] == 0) {
                    flag = false;
                }
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input N : ");
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        System.out.println("Input matrix : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println((solve(arr, n) ? "YES" : "NO"));
    }
}