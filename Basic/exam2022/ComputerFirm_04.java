package exam2022;

import java.util.Scanner;

public class ComputerFirm_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberComputer = Integer.parseInt(scanner.nextLine());
        int a = 0;
        int b = 0;
        double aCount = 0;
        double bRcount =0;

        for (int i = 1; i <= numberComputer; i++) {
            int n = Integer.parseInt(scanner.nextLine());
            a = n % 10;
            aCount += a;
            b = n / 10;
            double bReal = 0;
            if (a == 2){
                bReal = 0;
            }else if (a == 3) {
                bReal = b * 0.5;
                bRcount+= bReal;
            } else if (a == 4) {
                bReal = b * 0.7;
                bRcount+= bReal;
            } else if (a == 5) {
                bReal = b * 0.85;
                bRcount+= bReal;
            } else if (a == 6) {
                bReal = b * 1;
                bRcount+= bReal;

            }
        }
        System.out.printf("%.2f%n",bRcount);
        System.out.printf("%.2f", aCount/numberComputer);


    }
}
