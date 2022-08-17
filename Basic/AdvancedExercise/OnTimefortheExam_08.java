package AdvancedExercise;

import java.util.Scanner;

public class OnTimefortheExam_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hourexam = Integer.parseInt(scanner.nextLine());
        int minexam = Integer.parseInt(scanner.nextLine());
        int hourarrival = Integer.parseInt(scanner.nextLine());
        int minarrival = Integer.parseInt(scanner.nextLine());
        int hourexamM = hourexam * 60 + minexam;
        int hourarrivalM = hourarrival * 60 + minarrival;

        int diff = Math.abs(hourarrivalM - hourexamM);
        int hour = diff / 60;
        int min = diff % 60;

        if (hourarrivalM > hourexamM) {
            System.out.println("Late");
            if (hour == 0) {
                System.out.printf("%d minutes after the start", diff);
            } else {
                System.out.printf("%d:%02d hours after the start", hour, min);
            }
        } else if (hourexamM == hourarrivalM || diff <= 30) {
            System.out.println("On time");
            if (diff != 0) {
                System.out.printf("%d minutes before the start", min);
            }
        } else {
            System.out.println("Early");
            if (hour == 0) {
                System.out.printf("%d minutes before the start", min);
            } else {
                System.out.printf("%d:%02d hours before the start", hour, min);
            }


        }
    }
}

