package ForLoopLab;

import java.util.Scanner;

public class OddEvenSum_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int even = 0;
        int odd = 0;

        for (int i = 1; i <= n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            if (i % 2 == 0) {
                even += number;
            } else {
                odd += number;
            }
        }
        if (even == odd){
            System.out.printf("Yes%nSum = %d", even);
        }else
            System.out.printf("No%nDiff = %d",Math.abs(even - odd));
    }
}
