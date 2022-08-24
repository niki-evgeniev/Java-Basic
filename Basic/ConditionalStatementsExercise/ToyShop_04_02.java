package ConditionalStatementsExercise;

import java.util.Scanner;

public class ToyShop_04_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double excursion = Double.parseDouble(scanner.nextLine());
        int puzzle = Integer.parseInt(scanner.nextLine());
        int dols = Integer.parseInt(scanner.nextLine());
        int bear = Integer.parseInt(scanner.nextLine());
        int minion = Integer.parseInt(scanner.nextLine());
        int truck = Integer.parseInt(scanner.nextLine());

        double totalpuzzle = puzzle * 2.60;
        double totaldols = dols * 3;
        double totalbear = bear * 4.10;
        double totalminion = minion * 8.20;
        double totaltruck = truck * 2;
        double totalprice = totalpuzzle + totaldols + totalbear + totalminion + totaltruck;
        int totaltoy = puzzle + dols + bear + minion + truck;

        if (totaltoy >= 50) {
            totalprice = totalprice - (totalprice * 0.25);
        }

        totalprice = totalprice - (totalprice * 0.1);

        if (totalprice >= excursion) {
            System.out.printf("Yes! %.2f lv left.", totalprice - excursion);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", excursion - totalprice);

        }
    }
}