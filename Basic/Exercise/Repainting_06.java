package Exercise;

import java.util.Scanner;

public class Repainting_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nylon = Integer.parseInt(scanner.nextLine());
        int paint = Integer.parseInt(scanner.nextLine());
        int thinner = Integer.parseInt(scanner.nextLine());
        int time = Integer.parseInt(scanner.nextLine());
//За всеки случай, към необходимите материали, Румен иска да добави още 10% от количеството боя и 2 кв.м. найлон,
// разбира се и 0.40 лв. за торбички. Сумата, която се заплаща на майсторите за 1 час работа, е равна на 30% от сбора на всички разходи за материали.
        double toatalNylon = nylon + 2;
        double priceNylon = toatalNylon * 1.50;
        double totalPaint = paint + (paint * 10 / 100.00);
        double pricePaint = totalPaint * 14.5;
        double priceThinner = thinner * 5;
        double totalPrice = priceNylon + pricePaint + priceThinner + 0.4;
        double totalMaster = (totalPrice * 30 / 100) * time;
        double TotalPrice = totalPrice + totalMaster;
        System.out.println(TotalPrice);

    }




}
