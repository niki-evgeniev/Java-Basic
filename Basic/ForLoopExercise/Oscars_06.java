package ForLoopExercise;

import java.util.Scanner;

public class Oscars_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String actors = scanner.nextLine();
        double academyPoint = Double.parseDouble(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());




        for (int i = 0; i < n; i++) {
            String text = scanner.nextLine();
            double juriPoint = Double.parseDouble(scanner.nextLine());
            int length = text.length();
            //дължината на името на оценяващия умножено по точките, които дава делено на две.
            academyPoint += juriPoint * length /2;
            if (academyPoint >= 1250.5 ){
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!",actors , academyPoint);
                        break;
            }
        }
        if (academyPoint < 1250.5 ){
            System.out.printf("Sorry, %s you need %.1f more!",actors, 1250.5 - academyPoint);
        }

    }
}
