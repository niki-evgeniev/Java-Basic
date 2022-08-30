package ForLoopExercise;

import java.util.Scanner;

public class HalfSumElement_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int maxvalue = Integer.MIN_VALUE;
        int total = 0 ;


        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            total += number;
            if (maxvalue < number) {
                maxvalue = number;
            }
        }
        if (maxvalue == (total - maxvalue)){
            System.out.printf("Yes%nSum = %d",maxvalue);
        }else {
            System.out.printf("No%nDiff = %d",Math.abs(maxvalue - (total- maxvalue)));
        }

    }
}
