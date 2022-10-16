package exam28and29March2020;

import java.util.Scanner;

public class CareofPuppy_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int food = Integer.parseInt(scanner.nextLine());
        food = food * 1000;
        int food1 = food;
        int food2 = 0;
        String input = scanner.nextLine();

        while (!input.equals("Adopted")) {
            int n = Integer.parseInt(input);
            food -= n;
            food2 += n;
            input = scanner.nextLine();
        }
        if (food1 >= food2){
            System.out.printf("Food is enough! Leftovers: %d grams.", food1 - food2);
        }else {
            System.out.printf("Food is not enough. You need %d grams more.",Math.abs(food1 - food2));
        }
    }
}
