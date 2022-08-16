package AdvancedExercise;

import java.util.Scanner;

public class Journey_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        double price = 0;
        String country = "";
        String pleace = "";

        if (budget <= 100) {
            country = "Bulgaria";
            switch (season) {
                case "summer":
                    pleace = "Camp";
                    price = budget * 0.30;
                    break;
                case "winter":
                    pleace = "Hotel";
                    price = budget * 0.70;
                    break;
            }

        } else if (budget <= 1000) {
            country = "Balkans";
            switch (season){
                case "summer":
                    pleace = "Camp";
                    price = budget * 0.40;
                    break;
                case "winter":
                    pleace = "Hotel";
                    price = budget * 0.80;
                    break;
            }

        } else if (budget > 1000) {
            country = "Europe";
            pleace = "Hotel";
            price = budget * 0.9;

        }
        System.out.printf("Somewhere in %s %n%s - %.2f", country, pleace, price );

    }
}