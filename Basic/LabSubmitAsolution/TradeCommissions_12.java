package LabSubmitAsolution;

import java.util.Scanner;

public class TradeCommissions_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String city = scanner.nextLine();
        double caunt = Double.parseDouble(scanner.nextLine());
        double total = 0;
        //Град	0 ≤ s ≤ 500         	500 < s ≤ 1 000	           1 000 < s ≤ 10 000	        s > 10 000
        //Sofia	5%	7%	8%	12%

        if (city.equals("Sofia")) {
            if (caunt >= 0 && caunt <= 500) {
                total = caunt * 0.05;
            } else if (caunt > 500 && caunt <= 1000) {
                total = caunt * 0.07;
            } else if (caunt > 1000 && caunt <= 10000) {
                total = caunt * 0.08;
            } else if (caunt > 10000) {
                total = caunt * 0.12;
            } else {
                System.out.println("error");
            }

        }
        if (city.equals("Varna")) {
            if (caunt >= 0 && caunt <= 500) {
                total = caunt * 0.045;
            } else if (caunt > 500 && caunt <= 1000) {
                total = caunt * 0.075;
            } else if (caunt > 1000 && caunt <= 10000) {
                total = caunt * 0.10;
            } else if (caunt > 10000) {
                total = caunt * 0.13;
            } else {
                System.out.println("error");
            }

        }
        if (city.equals("Plovdiv")) {
            if (caunt >= 0 && caunt <= 500) {
                total = caunt * 0.055;
            } else if (caunt > 500 && caunt <= 1000) {
                total = caunt * 0.08;
            } else if (caunt > 1000 && caunt <= 10000) {
                total = caunt * 0.12;
            } else if (caunt > 10000) {
                total = caunt * 0.145;
            } else {
                System.out.println("");
            }

        }
        if (total != 0) {
            System.out.printf("%.2f", total);
        } else {
            System.out.println("error");
        }

    }
}

