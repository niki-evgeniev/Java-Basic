package exam18and19July2020;

import java.util.Scanner;

public class AgencyProfit_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        double billets = Double.parseDouble(scanner.nextLine()); // брой билети
        double kidbillets = Double.parseDouble(scanner.nextLine()); // брой билети
        double priceBil = Double.parseDouble(scanner.nextLine()); // цена билет
        double tax = Double.parseDouble(scanner.nextLine()); // такса
        double priceKidbill = 0;
        double totalPrice = 0;
        priceKidbill = priceBil - priceBil * 0.7 + tax; // цена детски билет
        priceBil = priceBil + tax;

        totalPrice = billets * priceBil + kidbillets * priceKidbill;
        totalPrice = totalPrice * 0.2;

        System.out.printf("The profit of your agency from %s tickets is %.2f lv.",name, totalPrice);

    }
}
