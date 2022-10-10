package Exercise;

import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.Scanner;

public class USDtoBGN_01 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        double usd = Double.parseDouble(Scanner.nextLine());
        double bgn = usd * 1.79549;
        System.out.println(bgn);






    }
}
