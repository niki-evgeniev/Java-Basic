package Lab;

import java.util.Scanner;

public class ConcatenateData {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        String firstName = Scanner.nextLine();
        String lastName = Scanner.nextLine();
        int age = Integer.parseInt(Scanner.nextLine());
        String town = Scanner.nextLine();
        System.out.printf("You are %s %s, a %d-years old person from %s.", firstName, lastName, age, town);

    }
}
