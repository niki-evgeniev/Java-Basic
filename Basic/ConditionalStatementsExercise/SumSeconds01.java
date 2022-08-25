package ConditionalStatementsExercise;

import java.util.Scanner;

public class SumSeconds01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int TimeFirst = Integer.parseInt(scanner.nextLine());
        int TimeSecond = Integer.parseInt(scanner.nextLine());
        int TimeThird = Integer.parseInt(scanner.nextLine());
        int totalTimeSecond = TimeFirst + TimeSecond + TimeThird;
        int min = totalTimeSecond / 60;
        int sec = totalTimeSecond % 60;

        if (sec < 10) {
            System.out.printf("%d:0%d", min, sec);

        } else
            System.out.printf("%d:%d", min, sec);

    }

}
