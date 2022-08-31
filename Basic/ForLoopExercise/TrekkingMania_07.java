package ForLoopExercise;

import java.util.Scanner;

public class TrekkingMania_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double numberPeaple = 0;
        double musala = 0;
        double monbland = 0;
        double kilimandjaro = 0;
        double k2 = 0;
        double everest = 0;


        for (int i = 0; i < n; i++) {
            int group = Integer.parseInt(scanner.nextLine());
            numberPeaple += group;
            if (group <= 5) {
                musala += group;
            } else if (group <= 12) {
                monbland += group;
            } else if (group <= 25) {
                kilimandjaro += group;
            } else if (group <= 40) {
                k2 += group;
            } else if (group >= 41) {
                everest += group;
            }
        }
        double musalaP = musala / numberPeaple * 100;
        double monblandP = monbland / numberPeaple * 100;
        double kilimandjaroP = kilimandjaro / numberPeaple * 100;
        double k2P = k2 / numberPeaple * 100;
        double everestP = everest / numberPeaple * 100;


        System.out.printf("%.2f%%%n", musalaP);
        System.out.printf("%.2f%%%n", monblandP);
        System.out.printf("%.2f%%%n", kilimandjaroP);
        System.out.printf("%.2f%%%n", k2P);
        System.out.printf("%.2f%%%n", everestP);

    }
}
