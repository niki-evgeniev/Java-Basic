package AdvancedExercise;

import java.util.Scanner;

public class OperationsBetweenNumbers_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n1 = Double.parseDouble(scanner.nextLine());
        double n2 = Double.parseDouble(scanner.nextLine());
        String operator = scanner.nextLine();
        double sum = 0;
        String evenodd = "";

        if (operator.equals("+")) {
            sum = n1 + n2;
            if (sum % 2 == 0) {
                evenodd = "- even";
            } else
                evenodd = "- odd";
        } else if (operator.equals("-")) {
            sum = n1 - n2;
            if (sum % 2 == 0) {
                evenodd = "- even";
            } else
                evenodd = "- odd";
        } else if (operator.equals("*")) {
            sum = n1 * n2;
            if (sum % 2 == 0) {
                evenodd = "- even";
            } else
                evenodd = "- odd";
        } else if (operator.equals("/")) {
            sum = n1 / n2;
        } else if (operator.equals("%")) {
            sum = n1 % n2;
        }
        if (n2 != 0) {
            switch (operator) {
                case "+":
                case "-":
                case "*":
                    System.out.printf("%.0f %s %.0f = %.0f %s", n1, operator, n2, sum, evenodd);
                    break;
                case "/":
                    System.out.printf("%.0f %s %.0f = %.2f", n1, operator, n2, sum);
                    break;
                case "%":
                    System.out.printf("%.0f %s %.0f = %.0f", n1, operator, n2, sum);
                    break;
            }
        } else {
            System.out.printf("Cannot divide %.0f by zero", n1);
        }


    }
}


