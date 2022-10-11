package WhileLoopExercise;

import java.util.Scanner;

public class Walking_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String step = scanner.nextLine();
        int steps = 10000;
        int allSteps = 0;
        boolean isValid = true;

        while (allSteps <= steps) {
            if (step.equals("Going home")) {
                isValid = false;
                break;
            }
            int st = Integer.parseInt(step);
            allSteps += st;
            if (allSteps >= steps) {
                break;
            }
            step = scanner.nextLine();
        }
        if (step.equals("Going home")) {
            step = scanner.nextLine();
            int st = Integer.parseInt(step);
            allSteps += st;
        }
        if (allSteps > steps) {
            System.out.println("Goal reached! Good job!");
            System.out.printf("%d steps over the goal!", allSteps - steps);
        }else {
            System.out.printf("%d more steps to reach goal.",Math.abs(allSteps - steps));
        }


    }
}
