package Lab;

import java.util.Scanner;

public class petShop {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        //вход
        double dogfood = Double.parseDouble(Scanner.nextLine());
        double catfood = Double.parseDouble(Scanner.nextLine());
        //изчисления
        double pricedogfood = dogfood * 2.5;
        double pricecatfood = catfood * 4.;
        double result = pricedogfood + pricecatfood;

        //печатане резултат
        System.out.println(result + " lv");
    }
}
