package ConditionalStatementsExercise;

import java.util.Scanner;

public class ToyShop_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double excursion = Double.parseDouble(scanner.nextLine());
        int puzzle = Integer.parseInt(scanner.nextLine());
        int dols = Integer.parseInt(scanner.nextLine());
        int bear = Integer.parseInt(scanner.nextLine());
        int minion = Integer.parseInt(scanner.nextLine());
        int truck = Integer.parseInt(scanner.nextLine());

        int totaltoy = puzzle + dols + bear + minion + truck;
        double totalpuzzle = puzzle * 2.60;
        double totaldols = dols * 3;
        double totalbear = bear * 4.10;
        double totalminion = minion * 8.20;
        double totaltruck = truck * 2;
        double totalprice = totalpuzzle + totaldols + totalbear + totalminion + totaltruck;
        double discaunt = 0;

        if (totaltoy >= 50) {
            discaunt = totalprice * 0.25;
            double total = totalprice - discaunt;
            double totalprice1 = total - (total * 0.1);
            double leftmoney = totalprice1 - excursion;
            System.out.printf("Yes! %f lv left.", leftmoney);
        } else {
            double totalex = totalprice - (totalprice * 0.1);
            double leftmoney2 = totalex - excursion;
            System.out.printf(" Not enough money! %f lv needed.",Math.abs(leftmoney2), leftmoney2);
        }


    }
}
