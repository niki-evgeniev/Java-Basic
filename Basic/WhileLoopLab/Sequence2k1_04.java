package WhileLoopLab;

import java.util.Scanner;

public class Sequence2k1_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int numb = 1;

        while (n >= numb){
            System.out.println(numb);
            numb = numb * 2 + 1;
        }
    }
}
