package FirstMoreExercises;

import java.util.Scanner;

public class TriangleArea_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(scanner.nextLine());
        double h =Double.parseDouble(scanner.nextLine());
        double results = a * h /2;
        System.out.printf("%.2f",results);


    }

}
