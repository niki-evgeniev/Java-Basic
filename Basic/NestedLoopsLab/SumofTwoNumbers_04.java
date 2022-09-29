package NestedLoopsLab;

import java.util.Scanner;

public class SumofTwoNumbers_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int magic = Integer.parseInt(scanner.nextLine());
        boolean magicnumber = true;
        int count = 0;
        int first = 0;
        int second = 0;

        for (int i = start; i <= end; i++) {
            if (!magicnumber) {
                break;
            }
            first = i;
            for (int j = start; j <= end; j++) {
                int sum = i + j;
                count++;
                second = j;
                if (sum == magic) {
                    magicnumber = false;
                    break;
                }
            }
        }
        if (!magicnumber) {
            System.out.printf("Combination N:%d (%d + %d = %d)", count, first, second, first + second);
        } else {
            System.out.printf("%d combinations - neither equals %d", count,magic);
        }


    }
}
