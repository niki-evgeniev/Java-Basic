package ForLoopExercise;

import java.util.Scanner;

public class TennisRanklist_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int startPoint = Integer.parseInt(scanner.nextLine());
        int w = 0;
        int f = 0;
        int sf = 0;
        int wWin = 0;

        for (int i = 0; i < n; i++) {
            String tournament = scanner.nextLine();
            switch (tournament) {
                case "W":
                    w += 2000;
                    wWin += 1;
                    break;
                case "F":
                    f += 1200;
                    break;
                case "SF":
                    sf += 720;
                    break;
            }
        }
        int totalPoint = sf + f + w + startPoint;
        int average = (sf + f + w) / n;
        double win = wWin * 1.00 / n * 100; // умножаваме *1 да превърнем числото в double
        System.out.printf("Final points: %d%n", totalPoint);
        System.out.printf("Average points: %d%n", average);
        System.out.printf("%.2f%%", win);


    }
}
