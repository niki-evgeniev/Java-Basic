package exam2022;

import java.util.Scanner;

public class MaidenParty_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int messages = Integer.parseInt(scanner.nextLine());
        int rouse = Integer.parseInt(scanner.nextLine());
        int keychain = Integer.parseInt(scanner.nextLine());
        int karikature = Integer.parseInt(scanner.nextLine());
        int lucky = Integer.parseInt(scanner.nextLine());
        double totalPrice = 0;
        int count = 0;
        totalPrice = (messages * 0.60 + rouse * 7.20 + keychain * 3.60 + karikature * 18.20 + lucky * 22);
        count = messages + rouse + keychain + karikature + lucky;

        if (count > 25) {
            totalPrice = totalPrice - totalPrice * 0.35;
        }
        totalPrice = totalPrice - totalPrice * 0.1;
        if (totalPrice > budget){
            System.out.printf("Yes! %.2f lv left.",totalPrice - budget);
        }else if (budget > totalPrice){
            System.out.printf("Not enough money! %.2f lv needed.",budget - totalPrice);
        }


    }
}
