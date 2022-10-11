package WhileLoopExercise;

import java.util.Scanner;

public class Vacation_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double needMoney = Double.parseDouble(scanner.nextLine());
        double money = Double.parseDouble(scanner.nextLine());
        int days = 0;
        int spendDay = 0;

        while (needMoney > money) {
            if (spendDay == 5) {
                break;
            }
            String stringName = scanner.nextLine();
            double mo = Double.parseDouble(scanner.nextLine());
            days++;
            if (stringName.equals("spend")) {
                money = money - mo;
                spendDay++;
                if (money < 0) {
                    money = 0;
                }
            } else if (stringName.equals("save")) {
                money = money + mo;
                spendDay = 0;
            }
        }
        if (spendDay == 5) {
            System.out.println("You can't save the money.");
            System.out.println(days);
        } else if (money >= needMoney) {
            System.out.printf("You saved the money for %d days.", days);
        }
    }
}
