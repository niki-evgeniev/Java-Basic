package ConditionalStatementsExercise;

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int vga = Integer.parseInt(scanner.nextLine());
        int cpu = Integer.parseInt(scanner.nextLine());
        int ram = Integer.parseInt(scanner.nextLine());

        double pricevga = vga * 250;
        double pricecpu = cpu * (pricevga * 0.35);
        double priceram = ram * (pricevga * 0.1);
        double totalprice = pricevga + pricecpu + priceram;

        if (vga > cpu) {
            totalprice = totalprice - (totalprice * 0.15);

        }
        if (budget >= totalprice) {
            System.out.printf("You have %.2f leva left!", budget - totalprice);
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", totalprice - budget);
        }

    }
}
