package NestedLoopsExercise;

import java.util.Scanner;

public class TraintheTrainers_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String name = scanner.nextLine();
        double allAsses = 0;
        int counter = 0;

        while (!name.equals("Finish")) {
            double total1  = 0;

            for (int i = 0; i < n; i++) {
                double sum = Double.parseDouble(scanner.nextLine());
                counter++;
                allAsses += sum;
                total1 += sum;
            }
            System.out.printf("%s - %.2f.%n",name,total1 / n);
            name = scanner.nextLine();
        }
        System.out.printf("Student's final assessment is %.2f.",allAsses / counter);
    }

}

