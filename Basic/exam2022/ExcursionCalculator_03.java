package exam2022;

import java.util.Scanner;

public class ExcursionCalculator_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        double totalPrice = 0;

        if (number <= 5) {
            switch (season) {
                case "spring":
                    totalPrice = number * 50;
                    break;
                case "summer":
                    totalPrice = number * 48.50;
                    totalPrice = totalPrice - totalPrice * 0.15;
                    break;
                case "autumn":
                    totalPrice = number * 60.00;
                    break;
                case "winter":
                    totalPrice = number * 86.00;
                    totalPrice = totalPrice + totalPrice * 0.08;
                    break;
            }

        } else if (number > 5) {
            switch (season){
                case "spring":
                    totalPrice = number * 48.00;
                    break;
                case "summer":
                    totalPrice = number * 45.00;
                    totalPrice = totalPrice - totalPrice * 0.15;
                    break;
                case "autumn":
                    totalPrice = number * 49.50;
                    break;
                case "winter":
                    totalPrice = number * 85.00;
                    totalPrice = totalPrice + totalPrice * 0.08;
                    break;
            }
        }
        System.out.printf("%.2f leva.", totalPrice);

    }
}
