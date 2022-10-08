package WhileLoopExercise;

import java.util.Scanner;

public class ExamPreparation_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberGrade = Integer.parseInt(scanner.nextLine());
        double midleGrade = 0; // sredna ocenka
        int zadachi = 0; //resheni zadachi
        int badgrade = 0; // loshi ocenki
        String lastproblem = ""; // posledna zadacha
        boolean isFailed = true;

        while (numberGrade > badgrade) {
            String name = scanner.nextLine();
            if (name.equals("Enough")) {
                isFailed = false;
                break;
            }
            lastproblem = name;
            int grade = Integer.parseInt(scanner.nextLine());
            zadachi++;
            midleGrade += grade;
            if (grade <= 4) {
                badgrade++;
            }
        }
        if (isFailed == true) {
            System.out.printf("You need a break, %d poor grades.", badgrade);
        } else {
            System.out.printf("Average score: %.2f%n", midleGrade / zadachi);
            System.out.printf("Number of problems: %d%n", zadachi);
            System.out.printf("Last problem: %s", lastproblem);

        }
    }
}
