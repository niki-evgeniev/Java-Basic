package LabSubmitAsolution;

import java.util.Scanner;

public class SmallShop_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        String city = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        double price = 0;

        if (city.equals("Sofia")) {
            switch (product) {
                case "coffee":
                    price = 0.5;
                    break;
                case "water":
                    price = 0.8;
                    break;
                case "beer":
                    price = 1.20;
                    break;
                case "sweets":
                    price = 1.45;
                    break;
                case "peanuts":
                    price = 1.60;
                    break;
            }

        } else if (city.equals("Plovdiv")) {
            switch (product) {
                case "coffee":
                    price = 0.4;
                    break;
                case "water":
                    price = 0.7;
                    break;
                case "beer":
                    price = 1.15;
                    break;
                case "sweets":
                    price = 1.30;
                    break;
                case "peanuts":
                    price = 1.50;
                    break;
            }

        } else if (city.equals("Varna")) {
            switch (product) {
                case "coffee":
                    price = 0.45;
                    break;
                case "water":
                    price = 0.7;
                    break;
                case "beer":
                    price = 1.1;
                    break;
                case "sweets":
                    price = 1.35;
                    break;
                case "peanuts":
                    price = 1.55;
                    break;
            }
        }
        System.out.println(quantity * price);

    }
}

