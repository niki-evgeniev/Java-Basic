package NestedLoopsExercise;

import java.util.Scanner;

public class SumPrimeNonPrime_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int odd  = 0;
        int even = 0;

        while (!input.equals("stop")){
            int number = Integer.parseInt(input);
            if (number < 0 ){
                System.out.println("Number is negative.");
                input = scanner.nextLine();
                continue;
            }
            boolean flag = true ;
            for (int i = 2; i <= number -1; i++) {
                if (number % i == 0){
                    even+= number;
                    flag = false;
                    break;
                }

            }
            if (flag){
                odd+= number;
            }
            input = scanner.nextLine();
        }
        System.out.printf("Sum of all prime numbers is: %d%n",odd);
        System.out.printf("Sum of all non prime numbers is: %d",even);



    }
}
