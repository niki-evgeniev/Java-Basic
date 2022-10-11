package Exercise;

import java.util.Scanner;

public class VacationBooksList_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberPages = Integer.parseInt(scanner.nextLine());
        int pages = Integer.parseInt((scanner.nextLine()));
        int numberdays = Integer.parseInt(scanner.nextLine());


        int alltime = numberPages /  pages;
        int days = alltime / numberdays;
        System.out.println(days);








    }


}
