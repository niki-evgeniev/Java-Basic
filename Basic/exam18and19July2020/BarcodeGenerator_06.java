package exam18and19July2020;

import java.util.Scanner;

public class BarcodeGenerator_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int a = Integer.parseInt(scanner.nextLine());
//        int b = Integer.parseInt(scanner.nextLine());
//        int c = ;
        String a22 = scanner.nextLine();
        String a11 = scanner.nextLine();
        char sumboll = a22.charAt(0);
        char sumboll1 = a22.charAt(1);
        char sumboll2 = a22.charAt(2);
        char sumboll3 = a22.charAt(3);

        char sumbol = a11.charAt(0);
        char sumbol1 = a11.charAt(1);
        char sumbol2 = a11.charAt(2);
        char sumbol3 = a11.charAt(3);

        for (int i = sumboll; i <= sumbol; i++) {
            for (int j = sumboll1; j <= sumbol1; j++) {
                for (int k = sumboll2; k <= sumbol2; k++) {
                    for (int l = sumboll3; l <= sumbol3; l++) {
                       // boolean number = a % i != 0 && a % j != 0 && a % k != 0 && a % l != 0;
                       // if (number){
                        //    System.out.printf("%d%d%d%d%n", i, j, k, l);
                        }
                    }

                }

            }

        }
    }

