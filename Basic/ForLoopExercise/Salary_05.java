package ForLoopExercise;

import java.util.Scanner;

public class Salary_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tab = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= tab; i++) {
            String web = scanner.nextLine();
            if (web.equals("Facebook")) {
                salary -= 150;
            } else if (web.equals("Instagram")) {
                salary -= 100;
            } else if (web.equals("Reddit")) {
                salary -= 50;
            }
            if (salary <= 0) {
                System.out.printf("You have lost your salary.");
                break;
            }
        }
        if (salary > 0) {
            System.out.println(salary);
        }
    }
}
