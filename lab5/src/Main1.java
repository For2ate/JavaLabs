import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input x and y for point 1 : ");
        int x = sc.nextInt(), y = sc.nextInt();
        Point pt1 = new Point(x, y);
        System.out.println("square point1 = " + pt1.Square());
        pt1.print();
    }

    public static class Point{

        int x1, y1;
        Point(int x, int y) {
            this.x1 = x;
            this.y1 = y;
        }


        public  void print() {
            System.out.println("x = " + this.x1 + ", y = " + this.y1 + ", Square = " + this.Square());
        }
        public int Square() {
            return x1 * y1;
        }

    }
}