package exam28and29March2020;

import java.util.Scanner;

public class TournamentofChristmas_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double totalmoney = 0;
        int daywin = 0;
        int daylost = 0;
        for (int i = 1; i <= n; i++) {
            int win = 0;
            int lose = 0;
            double money = 0;
            String name = scanner.nextLine();
            while (!name.equals("Finish")) {
                switch (name) {
                    case "win":
                        win++;
                        daywin++;
                        break;
                    case "lose":
                        lose++;
                        daylost++;
                        break;
                }
                name = scanner.nextLine();
            }
            money += win * 20;
            if (win > lose) {
                money = money + money * 0.1;
            }
            totalmoney+= money;

        }
        if (daywin> daylost){
            totalmoney = totalmoney + totalmoney * 0.2;
            System.out.printf("You won the tournament! Total raised money: %.2f",totalmoney);
        }else {
            System.out.printf("You lost the tournament! Total raised money: %.2f",totalmoney);
        }
    }
}

