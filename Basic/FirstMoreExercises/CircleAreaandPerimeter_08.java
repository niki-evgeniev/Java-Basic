package FirstMoreExercises;

import java.util.Scanner;

public class CircleAreaandPerimeter_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double r = Double.parseDouble(scanner.nextLine());
        double perimeter = Math.PI * 2 * r;
        double area = Math.PI * r * r;
        System.out.printf("%.2f",area);
        System.out.println();
        System.out.printf("%.2f", perimeter);
    }

}
