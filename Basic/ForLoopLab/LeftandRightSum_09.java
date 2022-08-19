package ForLoopLab;

import java.util.Scanner;

public class LeftandRightSum_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int lsum = 0;
        int rsum = 0;


        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            lsum += number;
        }
        for (int i = 0; i <n ; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            rsum += number;

        }
      if (lsum == rsum){
          System.out.printf("Yes, sum = %d",rsum);
      }else {
          System.out.printf("No, diff = %d",Math.abs(lsum - rsum));
      }
    }
}
