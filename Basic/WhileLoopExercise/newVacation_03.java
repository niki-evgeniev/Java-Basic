package WhileLoopExercise;

import java.util.Scanner;

public class newVacation_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double moneyVacation = Double.parseDouble(scanner.nextLine());
        double money = Double.parseDouble(scanner.nextLine());
        int spendDay = 0;
        int day = 0;

        while (moneyVacation > money) {
            if (spendDay == 5) {
                break;
            }
            String SpendSave = scanner.nextLine();
            double cash = Double.parseDouble(scanner.nextLine());
            day++;
            if (SpendSave.equals("save")) {
                spendDay=0;
                money = money + cash;
            }
            if (SpendSave.equals("spend")){
                spendDay++;
                money = money - cash;
                if (money < 0){
                    money = 0;
                }
            }
        }
        if (spendDay == 5){
            System.out.println("You can't save the money.");
            System.out.println(day);
        }else if (moneyVacation <= money){
            System.out.printf("You saved the money for %d days.", day);
        }
    }
}
