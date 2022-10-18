package exam28and29March2020;

import java.util.Scanner;

public class SuitcasesLoad_02_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double volume = Double.parseDouble(scanner.nextLine());
        String input = scanner.nextLine();
        int counter = 0;
        while (!input.equals("End")) {
            double suitcase = Double.parseDouble(input);
            if (volume <= suitcase) {
                System.out.println("No more space!");
                System.out.printf("Statistic: %d suitcases loaded.",counter);
                break;
            }
            counter++;
            if (counter % 3 == 0) {
                suitcase = suitcase + suitcase * 0.1;
            }
            volume -= suitcase;
            input = scanner.nextLine();
        }
        if (input.equals("End")){
            System.out.printf("Congratulations! All suitcases are loaded!%n");
            System.out.printf("Statistic: %d suitcases loaded.",counter);
        }
    }
}
