package WhileLoopExercise;

import java.util.Scanner;

public class Cake_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int piece = a * b;
        int count = 0;

        while (piece > 0) {
            String input = scanner.nextLine();
            if (input.equals("STOP")) {
                break;
            }
            int p = Integer.parseInt(input);
            piece -= p;
            count++;
        }
        if (piece > 0){
            System.out.printf("%d pieces are left.",piece);
        }else {
            System.out.printf("No more cake left! You need %d pieces more.",Math.abs(piece));
        }

    }
}
