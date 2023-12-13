package exam2022;

import java.util.Scanner;

public class ExcursionSale_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sea = Integer.parseInt(scanner.nextLine());
        int mountrain = Integer.parseInt(scanner.nextLine());
        String name = scanner.nextLine();
        int money = 0;
        int countS = 0;
        int countM = 0;
        boolean flag = false;
        boolean flag2 = false;

        while (!name.equals("Stop")) {
            if (name.equals("sea")) {
                if (countS >= sea){
                    flag = true;
                    name = scanner.nextLine();
                    continue;
                }
                money += 680;
                countS++;
            } else if (name.equals("mountain")) {
                if (countM >= mountrain){
                    flag2 = true;
                    name = scanner.nextLine();
                    continue;
                }
                money += 499;
                countM++;
            }
            if (sea == countS && mountrain == countM){
                break;
            }
            if (flag && flag2){
                break;
            }
            name = scanner.nextLine();
        }
        if (countS == sea && countM == mountrain){
            System.out.printf("Good job! Everything is sold.%n");
            System.out.printf("Profit: %d leva.", money);
        }else {
            System.out.printf("Profit: %d leva.",money);
        }

    }
}
