package WhileLoopExercise;

import java.util.Scanner;

public class Moving_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        int totalSpace = width * length * height;

        while (totalSpace > 0){
            String box = scanner.nextLine();
            if (box.equals("Done")){
                break;
            }
            int p = Integer.parseInt(box);
            totalSpace -= p;

        }
        if (totalSpace > 0){
            System.out.printf("%d Cubic meters left.",totalSpace);
        }else {
            System.out.printf("No more free space! You need %d Cubic meters more.",Math.abs(totalSpace));
        }



    }
}
