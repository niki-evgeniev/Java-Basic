package exam28and29March2020;

import java.util.Scanner;

public class FoodforPets_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day = Integer.parseInt(scanner.nextLine());
        double food = Double.parseDouble(scanner.nextLine());
        double dogfood = 0;
        double catfood = 0;
        int counter = 0;
        double bisvit = 0;
        for (int i = 1; i <= day; i++) {
            double dog = Double.parseDouble(scanner.nextLine());
            double cat = Double.parseDouble(scanner.nextLine());
            double bis = 0;
            dogfood += dog;
            catfood += cat;
            counter++;
            if (i % 3 == 0) {
                bis = (dog + cat) * 0.1;
                bisvit+=bis;
                counter = 0;
            }
        }
        double totalfood = dogfood + catfood;
        System.out.printf("Total eaten biscuits: %.0fgr.%n",bisvit);
        System.out.printf("%.2f%% of the food has been eaten.%n",totalfood / food * 100);
        System.out.printf("%.2f%% eaten from the dog.%n",dogfood  / totalfood * 100);
        System.out.printf("%.2f%% eaten from the cat.%n",catfood  / totalfood * 100);
    }
}
