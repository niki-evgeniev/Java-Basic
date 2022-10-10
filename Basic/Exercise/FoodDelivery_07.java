package Exercise;

import java.util.Scanner;

public class FoodDelivery_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chiken = Integer.parseInt(scanner.nextLine());
        int fish = Integer.parseInt(scanner.nextLine());
        int vegan = Integer.parseInt(scanner.nextLine());

        double totalFood = chiken * 10.35 + fish * 12.40 + vegan * 8.15;
        double sweet = totalFood * 20 / 100;
        double total = sweet + totalFood + 2.5;
        System.out.println(total);




    }
}
