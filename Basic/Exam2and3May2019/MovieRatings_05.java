package Exam2and3May2019;

import java.util.Scanner;

public class MovieRatings_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberMovie = Integer.parseInt(scanner.nextLine());
        // най- висок
        double highRat = 0;
        String highRat2 = "";
        //най- нисък
        double lowRat = 10;
        String lowRat2 = "";
        double counter = 0;

        for (int i = 1; i <= numberMovie; i++) {
            String movie = scanner.nextLine();
            double rating = Double.parseDouble(scanner.nextLine());
            counter += rating;
            if (highRat < rating){
                highRat2 = movie;
                highRat = rating;
            }else if (lowRat > rating){
                lowRat2 = movie;
                lowRat = rating;

            }
        }
        System.out.printf("%s is with highest rating: %.1f%n",highRat2,highRat);
        System.out.printf("%s is with lowest rating: %.1f%n",lowRat2,lowRat);
        System.out.printf("Average rating: %.1f",counter / numberMovie);
    }
}
