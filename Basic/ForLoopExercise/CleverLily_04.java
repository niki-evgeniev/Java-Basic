package ForLoopExercise;

import java.util.Scanner;

public class CleverLily_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int years = Integer.parseInt(scanner.nextLine());
        double washingmachine = Double.parseDouble(scanner.nextLine());
        int toy = Integer.parseInt(scanner.nextLine());
        int money = 0;
        int alltoy = 0;
        for (int i = 1; i <= years; i++) {
            if (i % 2 == 0) {
                money += (i * 10) / 2;
                money--;

            } else {
                alltoy++;
            }
        }
        money += toy * alltoy;
        if (washingmachine <= money) {
            System.out.printf("Yes! %.2f", money - washingmachine);

        } else {
            System.out.printf("No! %.2f",Math.abs(washingmachine- money) );
        }


    }
}
