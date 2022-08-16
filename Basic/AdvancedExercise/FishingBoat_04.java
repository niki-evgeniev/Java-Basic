package AdvancedExercise;

import java.util.Scanner;

public class FishingBoat_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fisherman = Integer.parseInt(scanner.nextLine());
        double priceboat = 0;
        switch (season) {
            case "Spring":
                priceboat = 3000;

                break;
            case "Summer":
            case "Autumn":
                priceboat = 4200;
                break;
            case "Winter":
                priceboat = 2600;

        }
        switch (season) {
            case "Spring":
            case "Summer":
            case "Winter":
                if (fisherman <= 6) {
                    priceboat = priceboat - priceboat * 0.1;
                } else if (fisherman > 6 && fisherman <= 11) {
                    priceboat = priceboat - priceboat * 0.15;
                } else if (fisherman >= 12) {
                    priceboat = priceboat - priceboat * 0.25;
                }
                if (fisherman % 2 == 0) {
                    priceboat = priceboat - priceboat * 0.05;

                }
                break;
                case "Autumn":
                if (fisherman <= 6) {
                    priceboat = priceboat - priceboat * 0.1;
                } else if (fisherman >= 7 && fisherman <= 11) {
                    priceboat = priceboat - priceboat * 0.15;
                } else if (fisherman >= 12)
                    priceboat = priceboat - priceboat * 0.25;
                break;

        }

        if (budget >= priceboat) {
            System.out.printf("Yes! You have %.2f leva left.", budget - priceboat);
        } else if (budget < priceboat) {
            System.out.printf("Not enough money! You need %.2f leva.", priceboat - budget);
        }


    }
}
