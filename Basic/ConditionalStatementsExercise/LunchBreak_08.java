package ConditionalStatementsExercise;

import java.util.Scanner;

public class LunchBreak_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int episode = Integer.parseInt(scanner.nextLine());
        double rest = Double.parseDouble(scanner.nextLine());

        double timelounch = rest * 1 / 8;
        double timerest = rest * 1 / 4;
        double lefttime = rest - timelounch - timerest;

        if (lefttime >= episode ) {
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.",name, Math.ceil(lefttime - episode));
        } else
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.",name, Math.ceil(episode - lefttime));


    }
}
