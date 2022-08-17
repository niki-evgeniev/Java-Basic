package AdvancedExercise;

import java.util.Scanner;

public class SkiTrip_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day = Integer.parseInt(scanner.nextLine());
        String room = scanner.nextLine();
        String eval = scanner.nextLine();
        double price = 0;
        double totalprice = 0;

        switch (room) {
            case "room for one person":
                price = 18.00;
                totalprice = price * (day - 1);
                break;
            case "apartment":
                price = 25;
                totalprice = price * (day - 1);
                if (day < 10) {
                    totalprice = totalprice - totalprice * 0.3;
                } else if (day >= 10 && day <= 15) {
                    totalprice = totalprice - totalprice * 0.35;
                } else if (day > 15) {
                    totalprice = totalprice - totalprice * 0.5;

                }
                break;
            case "president apartment":
                price = 35;
                totalprice = price * (day - 1);
                if (day < 10) {
                    totalprice = totalprice - totalprice * 0.1;
                } else if (day >= 10 && day <= 15) {
                    totalprice = totalprice - totalprice * 0.15;
                } else if (day > 15) {
                    totalprice = totalprice - totalprice * 0.2;
                    break;
                }
                break;
        }
        if (eval.equals("positive")) {
            totalprice = totalprice + totalprice * 0.25;
        } else if (eval.equals("negative")) {
            totalprice = totalprice - totalprice * 0.1;
        }
        System.out.printf("%.2f",totalprice);

    }
}
