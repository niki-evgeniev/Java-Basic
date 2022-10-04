package WhileLoopLab;

import java.util.Scanner;

public class AccountBalance_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        double total = 0;

        while (!n.equals("NoMoreMoney")) {
            double curentSum = Double.parseDouble(n);
            if (curentSum <= 0) {
                System.out.println("Invalid operation!");
                break;
            }
            total += curentSum;
            System.out.printf("Increase: %.2f%n", curentSum);

            n = scanner.nextLine();
        }
        System.out.printf("Total: %.2f",total);
    }
}
