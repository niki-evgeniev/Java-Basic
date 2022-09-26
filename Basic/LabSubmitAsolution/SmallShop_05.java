package LabSubmitAsolution;

import java.util.Scanner;

public class SmallShop_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double age = Double.parseDouble(scanner.nextLine());
        String gander = scanner.nextLine();

        if ("m".equals(gander)) {
            if (age >= 16)
                System.out.println("Mr.");
            else{
                System.out.println("Master");
            }

        }else if ("f".equals(gander)){
            if (age >= 16)
                System.out.println("Ms.");
            else{
                System.out.println("Miss");
            }

        }
    }
}
