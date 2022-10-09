package Exercise;

import java.util.Scanner;

public class FishTank_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int h = Integer.parseInt(scanner.nextLine());
        double Procent = Double.parseDouble(scanner.nextLine());
        double size = a * b * h;
        double dm = size / 1000;
        double ProcentCalculate = Procent / 100;
        double total = dm * ProcentCalculate;
        double total2 = dm - total;
        System.out.println(total2);

    }
}
