package FirstMoreExercises;

import java.util.Scanner;

public class VegetableMarket_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double priceVegetable = Double.parseDouble(scanner.nextLine());
        double priceFruits = Double.parseDouble(scanner.nextLine());
        double kgVegetable = Double.parseDouble(scanner.nextLine());
        double kgFruits = Double.parseDouble(scanner.nextLine());

        double allvegetable = priceVegetable * kgVegetable;
        double allfruits = priceFruits * kgFruits;
        double allpricelev = allfruits + allvegetable;
        double euro = allpricelev / 1.94;

        System.out.printf("%.2f",euro);

    }
}
