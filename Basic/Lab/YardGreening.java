package Lab;

import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        double yard = Double.parseDouble(Scanner.nextLine());
        double priceTotal = yard * 7.61;
        double discount = priceTotal * 0.18;
        double priceEnd = priceTotal - discount;
        System.out.println("final price is: " + priceEnd + " lv");
        System.out.println("The discount is: " + discount + " lv");

    }
}
