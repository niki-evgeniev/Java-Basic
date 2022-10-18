package Exam2and3May2019;

import java.util.Scanner;

public class VetParking_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day = Integer.parseInt(scanner.nextLine());
        int hour = Integer.parseInt(scanner.nextLine());
        double dayeven = 0;
        double dayodd = 0;
        double olwderCase = 0;


        for (int i = 1; i <= day; i++) {
            double dayF = 0;
            double hourF = 0;
            double olwF = 0;
            for (int j = 1; j <= hour; j++) {
                if (i % 2 == 0 && j % 2 != 0) {
                    dayeven += 2.50;
                    dayF += 2.50;
                } else if (i % 2 != 0 && j % 2 == 0) {
                    dayodd += 1.25;
                    hourF += 1.25;
                } else {
                    olwderCase++;
                    olwF++;
                }
            }
            System.out.printf("Day: %d - %.2f leva%n", i, dayF + hourF + olwF);
        }
        System.out.printf("Total: %.2f leva", dayeven + dayodd + olwderCase);
    }
}
