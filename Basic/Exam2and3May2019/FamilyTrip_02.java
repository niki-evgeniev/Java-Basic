package Exam2and3May2019;

import java.util.Scanner;

public class FamilyTrip_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int day = Integer.parseInt(scanner.nextLine());
        double price = Double.parseDouble(scanner.nextLine());
        double procent = Double.parseDouble(scanner.nextLine());
        double totalPrice = 0; //цени всички нощувки
        double tatalSpend = 0; //други разходи
        double total = 0; //всички разходи
        double total1 = 0;
        if (day > 7) {
            price = price * 0.95;
        }
        totalPrice = price * day; // всички нощувки
        tatalSpend = budget * (procent / 100);
        total = budget - totalPrice - tatalSpend;
        total1 = totalPrice + tatalSpend;
        if (total1 > budget) {
            System.out.printf("%.2f leva needed.", total1 - budget);
        } else if (budget >= total1) {
            System.out.printf("Ivanovi will be left with %.2f leva after vacation.", budget - total1);
        }


    }
}
