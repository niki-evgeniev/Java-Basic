package NestedLoopsExercise;

import java.util.Scanner;

public class CinemaTickets_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String movieName = scanner.nextLine();
        boolean flag = true;
        int totalcounter = 0;
        int totalStandart = 0;
        int totalKid = 0;
        int totalStudent = 0;
        while (!movieName.equals("Finish")) {
            int spots = Integer.parseInt(scanner.nextLine());
            String ticket = scanner.nextLine();
            int standard = 0;
            int kid = 0;
            int student = 0;
            int sportcount = 0;
            while (!ticket.equals("End")) {
                if (ticket.equals("Finish")) {
                    flag = false;
                    break;
                }
                sportcount++;
                totalcounter++;
                switch (ticket) {
                    case "standard":
                        standard++;
                        totalStandart++;
                        break;
                    case "kid":
                        kid++;
                        totalKid++;
                        break;
                    case "student":
                        student++;
                        totalStudent++;
                        break;
                }
                if (sportcount >= spots){
                    break;
                }
                ticket = scanner.nextLine();
            }
            System.out.printf("%s - %.2f%% full.%n", movieName, (sportcount * 1.00) / spots * 100);

            if (!flag) {
                break;
            }
            movieName = scanner.nextLine();

        }
        System.out.printf("Total tickets: %d%n", totalcounter);
        System.out.printf("%.2f%% student tickets.%n", (totalStudent * 1.00) / totalcounter * 100);
        System.out.printf("%.2f%% standard tickets.%n", (totalStandart * 1.00) / totalcounter * 100);
        System.out.printf("%.2f%% kids tickets.", (totalKid * 1.00) / totalcounter * 100);
    }
}
