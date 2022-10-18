package Exam2and3May2019;

import java.util.Scanner;

public class Gymnastics_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String country = scanner.nextLine();
        String ured = scanner.nextLine();
        double point = 0;

        if (country.equals("Bulgaria")) {
            switch (ured) {
                case "ribbon":
                    point = 9.600 + 9.400;
                    break;
                case "hoop":
                    point = 9.550 + 9.750;
                    break;
                case "rope":
                    point = 9.500 + 9.400;
                    break;
            }
        } else if (country.equals("Russia")) {
            switch (ured) {
                case "ribbon":
                    point = 9.100 + 9.400;
                    break;
                case "hoop":
                    point = 9.300 + 9.800;
                    break;
                case "rope":
                    point = 9.600 + 9.000;
                    break;
            }
        } else if (country.equals("Italy")) {
            switch (ured) {
                case "ribbon":
                    point = 9.200 + 9.500;
                    break;
                case "hoop":
                    point = 9.450 + 9.350;
                    break;
                case "rope":
                    point = 9.700 + 9.150;
                    break;
            }
        }
        double procent = 20 - point;
        procent = procent / 20 * 100;
        System.out.printf("The team of %s get %.3f on %s.%n", country, point, ured);
        System.out.printf("%.2f%%", procent);
    }
}
