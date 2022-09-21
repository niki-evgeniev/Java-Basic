package Lab;

import java.util.Scanner;

public class SantimetrsInch {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        double inch = Double.parseDouble(Scanner.nextLine());
        double result = inch * 2.54;
        System.out.println(result);
    }


}
