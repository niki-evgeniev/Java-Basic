package Exam2and3May2019;

import java.util.Scanner;

public class TouristShop_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String name = scanner.nextLine();
        int counter = 0;
        double money1 = 0;
        boolean flag = false;

        while (!name.equals("Stop")) {
            double price = Double.parseDouble(scanner.nextLine());
            counter++;
            if (counter % 3 == 0) {
                price /= 2;
            }
            if (price > budget) {
                System.out.println("You don't have enough money!");
                System.out.printf("You need %.2f leva!", price - budget);
                flag = true;
                break;
            }
            budget -= price;
            money1 += price;

            name = scanner.nextLine();
        }
        if (!flag) {
            System.out.printf("You bought %d products for %.2f leva.", counter, money1);
        }

    }
}
