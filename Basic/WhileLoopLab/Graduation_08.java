package WhileLoopLab;

import java.util.Scanner;

public class Graduation_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int fale = 1;
        int skusan = 0;
        double ocenki = 0;
        while (fale <= 12) {
            double evaluation = Double.parseDouble(scanner.nextLine());
            ocenki += evaluation;
            if (evaluation <= 4) {
                skusan++;
            }
            if (skusan > 1) {
                System.out.printf("%s has been excluded at %d grade", name, fale);
                break;
            }
            if (evaluation >= 4) {
                fale++;
                skusan= 0;
            }
        }
        ocenki = ocenki / 12;
        if (fale > 12) {
            System.out.printf("%s graduated. Average grade: %.2f", name, ocenki);
        }
    }
}
