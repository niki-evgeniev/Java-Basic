package WhileLoopExercise;

import java.util.Scanner;

public class OldBooks_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String bookName = scanner.nextLine();
        String input = scanner.nextLine();
        int bookNumber = 0;
        boolean isFaund = false;
        while (!input.equals("No More Books")){
            if (input.equals(bookName)){
                isFaund = true;
                break;
            }
            bookNumber ++;
            input = scanner.nextLine();
        }
        if (isFaund == true ){
            System.out.printf("You checked %d books and found it.",bookNumber);
        }else {
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books.",bookNumber);
        }

    }
}
