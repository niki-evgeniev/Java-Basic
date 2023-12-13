package exam2022;

import java.util.Scanner;

public class Substitute_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = Integer.parseInt(scanner.nextLine());
        int l = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        int count = 0;
//•	Първата цифра на първото число е в интервала от цифрата K до 8, включително.
//•	Втората цифра на първото число е в интервала от 9 до L, включително.
//•	Първата цифра на второто число е в интервала от цифрата M до 8, включително.
//•	Втората цифра на второто число е в интервала от 9 до N, включително.

        for (int i = k; i <= 8; i++) {
            for (int j = 9; j >= l; j--) {
                for (int o = m; o <= 8; o++) {
                    for (int p = 9; p >= n; p--) {
                        boolean number = i % 2 == 0 && j % 2 != 0 && o % 2 == 0 && p % 2 != 0;
                        if (number) {
                            if (count >= 6) {
                                break;
                            }
                            if (i == o && j == p) {
                                System.out.printf("Cannot change the same player.%n");
                            } else {
                                count++;
                                System.out.printf("%d%d - %d%d%n", i, j, o, p);
                            }
                        }
                    }
                }
            }
        }
    }
}
