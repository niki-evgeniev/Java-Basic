package ConditionalStatementsExercise;

import java.util.Scanner;

public class WorldSwimmingRecord_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double record = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double timeSwim1m = Double.parseDouble(scanner.nextLine());

        double needtimeforswim = distance * timeSwim1m;
        double totaltime = Math.floor (distance / 15) * 12.5 + needtimeforswim;


        if (totaltime < record) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.",totaltime );

        }else{
            System.out.printf("No, he failed! He was %.2f seconds slower.", totaltime - record);

        }


    }
}
