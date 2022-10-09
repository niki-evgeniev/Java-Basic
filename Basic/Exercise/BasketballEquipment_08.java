package Exercise;

import java.util.Scanner;

public class BasketballEquipment_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tax = Integer.parseInt(scanner.nextLine());
        //•	Баскетболни кецове – цената им е 40% по-малка от таксата за една година
        //•	Баскетболен екип – цената му е 20% по-евтина от тази на кецовете
        //•	Баскетболна топка – цената ѝ е 1 / 4 от цената на баскетболния екип
        //•	Баскетболни аксесоари – цената им е 1 / 5 от цената на баскетболната топка
        double sneakers = tax - (tax * 0.4);
        double equip = sneakers - (sneakers * 0.2);
        double boll = equip * 1 / 4;
        double acc = boll * 1 / 5;
        double totalPrice = sneakers + equip + boll + acc + tax;
        System.out.println(totalPrice);


    }
}
