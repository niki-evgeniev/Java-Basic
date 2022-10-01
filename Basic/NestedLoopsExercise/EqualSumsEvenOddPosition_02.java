package NestedLoopsExercise;

import java.util.Scanner;

public class EqualSumsEvenOddPosition_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());

        for (int i = first; i <= second; i++) {
            int currnetNum = i;
            int even = 0;
            int odd = 0;

            for (int j = 0; j < 6; j++) {
                int digit = currnetNum % 10;
                if (j % 2 == 0) {
                    even += digit;
                } else {
                    odd += digit;
                }
                currnetNum = currnetNum / 10;

            }
            if (even == odd) {
                System.out.print(i + " ");
            }
        }

    }
}
