import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Paral pr1 = new Paral();
        System.out.println("input rebra paral1 : ");
        pr1.Init();
        pr1.Print();
        System.out.println("input rebra paral2 : " );
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        Paral pr2 = new Paral(a, b, c);
        pr2.Print();
    }

    public static class Paral{

        int a, b, c;

        Paral() {
            this.a = 0;
            this.b = 0;
            this.c = 0;
        }
        Paral(int a, int b, int c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        public void Init(){
            Scanner sc = new Scanner(System.in);
            this.a = sc.nextInt();
            this.b = sc.nextInt();
            this.c = sc.nextInt();
            sc.close();
        }

        public int Volume() {
            return this.a * this.b * this.c;
        }

        public int SumRebr() {
            return this.a * 4 + this.b * 4 + this.c * 4;
        }

        public  void Print() {
            System.out.println("a = " + a + ", b = " + b + ", c = " + c + ", volume = " + this.Volume() + ", sum rebers = " + this.SumRebr());
        }

    }

}
