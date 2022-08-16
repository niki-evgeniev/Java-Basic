package AdvancedExercise;

import java.util.Scanner;

public class HotelRoom_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month = scanner.nextLine();
        int night = Integer.parseInt(scanner.nextLine());
        double apartment = 0;
        double studio = 0;


        if (month.equals("May") || month.equals("October")) {
            studio = night * 50;
            apartment = night * 65;
            if (night > 14) {
                studio = studio - studio * 0.3;
                // apartment = apartment - apartment * 0.05;
            } else if (night > 7) {
                studio = studio - studio * 0.05;
                // apartment = apartment - apartment * 0.3;
            }

        } else if (month.equals("June") || month.equals("September")) {
            studio = night * 75.20;
            apartment = night * 68.70;
            if (night > 14) {
                studio = studio - studio * 0.2;
            }
        } else if (month.equals("July") || month.equals("August")) {
            studio = night * 76;
            apartment = night * 77;
        }
        if (night > 14) {
            apartment = apartment - apartment * 0.1;
        }
        System.out.printf("Apartment: %.2f lv.", apartment);
        System.out.printf("%nStudio: %.2f lv.",studio);


    }
}
