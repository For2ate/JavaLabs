package lab10;

import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class Main {
        //var   21

        public static String filename = "E:\\Projects\\jaba\\lab6\\src\\lab10\\clients.txt";

        public static void main(String[] args) {
                createFile();
                fileFill();
                printFile();

                Scanner sc = new Scanner(System.in);

                while (true) {
                        System.out.println("instruction:\n0)exit\n1)print File\n2) add in file\n3)different cost\n");
                        int testCase = sc.nextInt();
                        switch (testCase) {
                                case 0 -> {
                                        return;
                                } case 1 -> {
                                        printFile();
                                } case 2 -> {
                                        Client curr = Client.init(sc);
                                        try (BufferedWriter byff = new BufferedWriter(new FileWriter(filename, true))){
                                                byff.write(curr.toString());
                                        } catch (IOException e){
                                                e.printStackTrace();
                                        }
                                } case 3 -> {
                                        try (BufferedReader buff = new BufferedReader(new FileReader(filename))) {
                                                System.out.println("input number of client:");
                                                int number = sc.nextInt();
                                                String line = "";
                                                for (int i = 0; i < number && (line = buff.readLine()) != null; i++);
                                                String []fields = line.split("\\|");
                                                int basicCost = Integer.parseInt(fields[1]);
                                                int socCost = Integer.parseInt(fields[2]);
                                                int month = Integer.parseInt(fields[3]);
                                                System.out.println("different is " + (socCost - basicCost) * month);
                                        } catch (IOException e) {
                                                e.printStackTrace();
                                        }
                                }default -> System.out.println("incorrect input\n");
                        }
                }

        }

        public static void createFile() {
                File file = new File(filename);
                if (!file.exists()) try {
                        file.createNewFile();
                } catch (IOException e) {
                        e.printStackTrace();
                }
        }

        public static void fileFill() {
                try (BufferedWriter byff = new BufferedWriter(new FileWriter(filename))){
                        for (int i = 0; i < 15; i++) {
                                Client current = Client.init();
                                byff.write(current.toString());
                        }
                } catch (IOException e){
                        e.printStackTrace();
                }
        }

        public static void printFile() {
                try (BufferedReader buff = new BufferedReader(new FileReader(filename))){
                        String line;
                        while ((line = buff.readLine()) != null) {
                                System.out.println(line);
                        }
                } catch (IOException e) {
                        e.printStackTrace();
                }
        }

}


