package exam2022;

import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double cpuPrice = Double.parseDouble(scanner.nextLine());
        double vgaPrice = Double.parseDouble(scanner.nextLine());
        double ramPrice = Double.parseDouble(scanner.nextLine());
        int countRam = Integer.parseInt(scanner.nextLine());
        double discount = Double.parseDouble(scanner.nextLine());
        double lev = 1.57;
        double totalPrice = 0;
        cpuPrice = cpuPrice * 1.57;
        vgaPrice = vgaPrice * 1.57;
        ramPrice = ramPrice * 1.57;
        ramPrice = ramPrice * countRam;
        cpuPrice = cpuPrice - (cpuPrice * discount);
        vgaPrice = vgaPrice - (vgaPrice * discount);
        totalPrice = vgaPrice + cpuPrice + ramPrice;
        System.out.printf("Money needed - %.2f leva.", totalPrice);

    }
}
