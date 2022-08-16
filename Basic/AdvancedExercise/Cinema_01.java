package AdvancedExercise;

import java.util.Scanner;

public class Cinema_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int s = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        double total = 0;

        if (name.equals("Premiere")) {
            total = s * c * 12;
        } else if (name.equals("Normal")) {
            total = s * c * 7.50;
        } else if (name.equals("Discount")) {
            total = s * c * 5.00;
        }
        System.out.printf("%.2f leva", total);


    }
}
