package NestedLoopsLab;

import java.util.Scanner;

public class Travelling_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        while (!name.equals("End")) {
            double budget = Double.parseDouble(scanner.nextLine());
            double totalmoney =0;
            while (totalmoney < budget) {
               double money = Double.parseDouble(scanner.nextLine());
                totalmoney += money;

            }
            System.out.printf("Going to %s!%n", name);
            name = scanner.nextLine();

        }

    }
}
