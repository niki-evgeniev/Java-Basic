package exam18and19July2020;

import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        int d = Integer.parseInt(scanner.nextLine());
        int counet = 0;
        for (int i = a; i <= 8; i++) {
            for (int j = 9; j >= b; j--) {
                for (int k = c; k <= 8; k++) {
                    for (int l = 9; l >= d; l--) {
                        boolean number = i % 2 == 0 && j % 2 != 0 && k % 2 == 0 && l % 2 != 0;

                        if (counet >= 6) {
                            break;
                        }
                        if (number) {
                            if (i == k && j == l) {
                                System.out.printf("Cannot change the same player.%n");
                            } else {
                                counet++;
                                System.out.printf("%d%d - %d%d%n", i, j, k, l);
                            }
                        }
//                        if (number) {
//                            System.out.printf("%d%d - %d%d%n", i, j, k, l);
//                        }
                    }
                }
            }
        }
    }
}
