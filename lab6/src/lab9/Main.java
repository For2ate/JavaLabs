package lab9;

//var 25

import java.util.*;

public class Main {


    public static void main(String[] args){
        Queue<Product> q = new LinkedList<Product>();
        for (int i = 0; i < 15; i++) {
            q.add(Product.init());
        }
        System.out.println("the array list is : ");
        for(Product i : q) {
            System.out.println(i.to_String());
        }
        Comparator<Product> cmp = (a, b) -> {
            if (a.getCnt() < b.getCnt()) {
                return 1;
            }else if (a.getCnt() == b.getCnt()){
                return 0;
            }else {
                return -1;
            }
        };

        Scanner sc = new Scanner(System.in);
        int testCase = 0;
        do {
            System.out.println("Instruction input:\n1)add new element\n2)delete element\n3)output all array\n4)output sort product for num\n5)exit");
            testCase = sc.nextInt();
            if(testCase == 1) {
                q.add(Product.init());
            }   else if(testCase == 2) {
                System.out.println("input index element");
                int num = sc.nextInt();
                Queue<Product> curentQ = new LinkedList<Product>();
                int cnt = 0;
                for (Product i : q) {
                    cnt++;
                    if (cnt == num) {
                        continue;
                    }
                    curentQ.add(i);
                }
                q = curentQ;
            } else if(testCase == 3) {
                System.out.println("array is:");
                for (Product i : q) {
                    System.out.println(i.to_String());
                }
            } else if(testCase == 4) {
                ArrayList<Product> current = new ArrayList<Product>();
                System.out.println("input numer:");
                int num = sc.nextInt();
                for (Product i : q) {
                    if (i.getNumer() == num) {
                        current.add(i);
                    }
                }
                current.sort(cmp);
                System.out.println("sorted products:");
                for (Product i : current) {
                    System.out.println(i.to_String());
                }
            } else if (testCase == 5){
                break;
            } else{
                System.out.println("incorrect input");
            }
        }while (true);

    }

}
