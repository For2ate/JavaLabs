import java.util.Scanner;

public class Main2 {

    public static int solve(int arr[][], int n) {
        int dp[][] = new int[n + 1][n + 1];
        for (int i = 0; i < n; i++) for (int j = 0; j < n; j++) dp[i][j] = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                dp[i][j] += arr[i - 1][j - 1] + Math.min(dp[i - 1][j], dp[i][j -1]);
            }
        }
        return dp[n][n];
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
        System.out.println(solve(arr, n));
    }
}
