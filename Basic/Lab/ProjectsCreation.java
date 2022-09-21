package Lab;

import java.util.Scanner;

public class ProjectsCreation {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        String Name = Scanner.nextLine();
        int numberProject = Integer.parseInt(Scanner.nextLine());
        int time = numberProject * 3;
        System.out.printf("The architect %s will need %d hours to complete %d project/s.",Name,time,numberProject);


    }
}