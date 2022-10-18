package exam28and29March2020;

import java.util.Scanner;

public class SuitcasesLoad_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double capacity = Double.parseDouble(scanner.nextLine());
        String suitcase = scanner.nextLine();
        int counter = 0;
        int counterSuit = 0;
        boolean flag = false;

        while (!suitcase.equals("End")) {
            double suit = Double.parseDouble(suitcase);
            if (capacity < suit) {
                System.out.println("No more space!");
                System.out.printf("Statistic: %d suitcases loaded.", counterSuit);
                flag = true;
                break;
            }
            counter++;
            counterSuit++;
            if (counter >= 3) {
                suit = suit + suit * 0.1;
                counter = 0;
            }
            capacity -= suit;
            suitcase = scanner.nextLine();
        }
        if (!flag) {
            System.out.println("Congratulations! All suitcases are loaded!");
            System.out.printf("Statistic: %d suitcases loaded.", counterSuit);
        }
    }
}
