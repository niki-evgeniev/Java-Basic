package ForLoopLab;

import java.util.Scanner;

public class NumberSequence_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 1; i <= n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            if (max < number) {
                max = number;
            }
            if (number < min) {
                min = number;
            }

        }
        System.out.printf("Max number: %d%nMin number: %d",max,min);

    }
}
