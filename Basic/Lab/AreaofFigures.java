package Lab;

import java.util.Scanner;

public class AreaofFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fig = scanner.nextLine();
        double area = 0;
        //square, rectangle, circle или triangle
        if (fig.equals("square")) {
            double a = Double.parseDouble(scanner.nextLine());
            area = a * a;

        } else if (fig.equals("rectangle")) {
            double a = Double.parseDouble(scanner.nextLine());
            double b = Double.parseDouble(scanner.nextLine());
            area = a * b;

        } else if (fig.equals("circle")) {
            double r = Double.parseDouble(scanner.nextLine());
            area = Math.PI * Math.pow(r, 2);

        } else if (fig.equals("triangle")) {
            double a = Double.parseDouble(scanner.nextLine());
            double h = Double.parseDouble(scanner.nextLine());
            area = a * h / 2;
        }
        System.out.printf("%.3f", area);

    }
}