package ConditionalStatementsExercise;

import java.util.Scanner;

public class Time15Minutes_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());
        int totalMinutes = hour * 60 + minutes + 15;

        int finalHour = totalMinutes / 60;
        int finalminuts = totalMinutes % 60;

        if (finalHour == 24) {
            finalHour = 0;
        }
        if (finalminuts < 10) {
            System.out.printf("%d:0%d", finalHour, finalminuts);

        }else
        System.out.printf("%d:%d", finalHour, finalminuts);


    }
}
