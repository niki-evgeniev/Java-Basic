package Lab;

import java.util.Scanner;

public class GreetingByName {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        String Name = Scanner.nextLine();
                //"Hello, <name>!",
        System.out.println("Hello, " +Name+ "!" );
    }
}
