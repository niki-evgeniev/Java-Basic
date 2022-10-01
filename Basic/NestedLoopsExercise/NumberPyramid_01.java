package NestedLoopsExercise;

import java.util.Scanner;

public class NumberPyramid_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int count = 1;
        boolean isValid = false;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {

                if (count > n) {
                    isValid = true;
                    break;
                }
                System.out.print(count + " ");
                count++;
            }
            if (isValid) {
                break;
            }
            System.out.println();
        }

    }
}
