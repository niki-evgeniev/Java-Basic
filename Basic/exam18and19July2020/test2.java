package exam18and19July2020;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        int d = Integer.parseInt(scanner.nextLine());
        for (int i = a; i <= 8; i++) {
            for (int j = 9; j >= b; j--) {
                boolean number = i % 2 == 0 & j % 2 != 0;
                if (number) {
                    System.out.printf("%d%d - ", i, j);

                }

                for (int k = c; k <= 8; k++) {
                    for (int l = 9; l >= d; l--) {
                        boolean number1 = k % 2 == 0 & l % 2 != 0;
                        if (i == k && l == j) {

                        } else if (number1) {
                            System.out.printf("%d%d%n", k, l);
                        }

                    }
                }
            }
        }


    }
}
