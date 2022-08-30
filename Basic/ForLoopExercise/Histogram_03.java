package ForLoopExercise;

import java.util.Scanner;

public class Histogram_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double p1 = 0;
        double p2 = 0;
        double p3 = 0;
        double p4 = 0;
        double p5 = 0;
        for (int i = 1; i <= n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            if (number <= 199) {
                p1++;
            } else if (number >= 200 && number <= 399) {
                p2 += 1;
            } else if (number >= 400 && number <= 599) {
                p3 += 1;
            } else if (number >= 600 && number <= 799) {
                p4 += 1;
            } else if (number >= 800) {
                p5 += 1;
            }
        }
        double p1p = 0;
        double p2p = 0;
        double p3p = 0;
        double p4p = 0;
        double p5p = 0;
        p1p = (p1 / n) * 100;
        p2p = (p2 / n) * 100;
        p3p = (p3 / n) * 100;
        p4p = (p4 / n) * 100;
        p5p = (p5 / n) * 100;
        System.out.printf("%.2f%%%n%.2f%%%n%.2f%%%n%.2f%%%n%.2f%%", p1p, p2p, p3p, p4p, p5p);


    }
}
