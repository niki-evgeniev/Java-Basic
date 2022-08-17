package AdvancedExercise;

import java.util.Scanner;

public class SummerOutfit_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dagrees = Integer.parseInt(scanner.nextLine());
        String timeDay = scanner.nextLine();
        String outfit = "";
        String shoes = "";


        if (timeDay.equals("Morning")) {
            if (dagrees >= 10 && dagrees <= 18) {
                outfit = "Sweatshirt";
                shoes = "Sneakers";
            } else if (dagrees > 18 && dagrees <= 24) {
                outfit = "Shirt";
                shoes = "Moccasins";
            } else {
                outfit = "T-Shirt";
                shoes = "Sandals";
            }
        }else if (timeDay.equals("Afternoon")){
            if (dagrees >= 10 && dagrees <= 18) {
                outfit = "Shirt";
                shoes = "Moccasins";
            } else if (dagrees > 18 && dagrees <= 24) {
                outfit = "T-Shirt";
                shoes = "Sandals";
            } else {
                outfit = "Swim Suit";
                shoes = "Barefoot";
            }

        }else if (timeDay.equals("Evening")){
            if (dagrees >= 10 && dagrees <= 18) {
                outfit = "Shirt";
                shoes = "Moccasins";
            } else if (dagrees > 18 && dagrees <= 24) {
                outfit = "Shirt";
                shoes = "Moccasins";
            } else {
                outfit = "Shirt";
                shoes = "Moccasins";
            }

        }
        System.out.printf("It's %d degrees, get your %s and %s.",dagrees,outfit,shoes);



    }
}
