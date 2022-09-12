package FirstMoreExercises;

import java.util.Scanner;

public class WeatherForecastPart2_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double dagree = Double.parseDouble(scanner.nextLine());
        if (dagree >= 26 && dagree <= 36) {
            System.out.println("Hot");
        }else if (dagree >= 20.1 && dagree <= 25.9){
            System.out.println("Warm");
        }else if (dagree >= 15.00 && dagree <= 20.00){
            System.out.println("Mild");
        }else if (dagree >= 12.00 && dagree <= 14.9){
            System.out.println("Cool");
        }else if (dagree >= 5.00 && dagree <= 11.9){
            System.out.println("Cold");

        }else{
            System.out.println("unknown");

        }
    }
}
