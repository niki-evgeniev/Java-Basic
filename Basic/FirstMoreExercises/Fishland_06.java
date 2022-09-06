package FirstMoreExercises;

import java.util.Scanner;

public class Fishland_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double skumria = Double.parseDouble(scanner.nextLine());
        double caca = Double.parseDouble(scanner.nextLine());
        double kgPalamud = Double.parseDouble(scanner.nextLine());
        double kgSafrid = Double.parseDouble(scanner.nextLine());
        double kgMidi = Double.parseDouble(scanner.nextLine());
        double pricePalamud = skumria + (skumria * 0.6);
        double pricePalamud2 = pricePalamud * kgPalamud;
        double priceSafrid = caca + (caca * 0.8);
        double priceSafrid2 = priceSafrid * kgSafrid;
        double priceMidi = kgMidi * 7.5;
        double totalprice = priceMidi + pricePalamud2 + priceSafrid2;
        System.out.printf("%.2f", totalprice);


    }

}
