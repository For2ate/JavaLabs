import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input count of cards N : ");
        int N = sc.nextInt(), sumAll = 0, sumWithout = 0;
        System.out.println("Input cards without one card : ");
        for (int i = 0; i < N - 1; i++) {
            int x = sc.nextInt();
            sumWithout += x;
        }
        for (int i = 1; i <= N; i++) {
            sumAll += i;
        }
        System.out.println("Number of lost card is : " + (sumAll - sumWithout));
    }
}