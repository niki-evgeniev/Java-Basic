package WhileLoopExercise;

import java.util.Scanner;

public class Coins_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double change = Double.parseDouble(scanner.nextLine());
        int count = 0;
        double coin = change * 100;

        while (coin != 0){

            if (coin >= 200){
                coin -= 200;
                count++;
            }else if (coin >= 100){
                coin -= 100;
                count++;
            }else if (coin >= 50){
                coin -= 50;
                count++;
            }else if (coin >= 20){
                coin -= 20;
                count++;
            }else if (coin >= 10){
                coin -= 10;
                count++;
            }else if (coin >= 5){
                coin -= 5;
                count++;
            }else if (coin >= 2){
                coin -= 2;
                count++;
            }else if (coin >= 1){
                coin -= 1;
                count++;
            }else {
                break;
            }
        }
        System.out.println(count);



    }
}
