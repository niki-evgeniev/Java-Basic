package Exercise;

import java.util.Scanner;

public class SuppliesforSchool_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // бройки за поръчване
        int pen = Integer.parseInt(scanner.nextLine());
        int marker = Integer.parseInt(scanner.nextLine());
        int preparation = Integer.parseInt(scanner.nextLine());
        int procent = Integer.parseInt(scanner.nextLine());

        //•	Пакет химикали - 5.80 лв.
        //•	Пакет маркери - 7.20 лв.
        //•	Препарат - 1.20 лв (за литър)
        double packagePen = pen * 5.80;
        double packegeMarker = marker * 7.20;
        double packegePreparation = preparation * 1.20;

        double totalPrice = packagePen + packegeMarker + packegePreparation;
        double priceNeed = totalPrice - (totalPrice * procent / 100.00);
        System.out.println(priceNeed);





    }





}
