package FirstMoreExercises;

import java.util.Scanner;

public class TrainingLab_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double w = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());
        //Едно работно място заема 70 на 120 cm (маса с размер 70 на 40 cm + място за стол и преминаване с размер 70 на 80 cm). Коридорът е широк поне 100 cm. Изчислено е,
        // че заради входната врата (която е с отвор 160 cm) се губи точно 1 работно място,
        // а заради катедрата (която е с размер 160 на 120 cm) се губят точно 2 работни места. Напишете програма,
        // която въвежда размери на учебната зала и изчислява броя работни места в нея при описаното разположение (вж. фигурата).
        //От конзолата се четат 2 числа, по едно на ред: w (дължина в метри) и h (широчина в метри).
        // Преобразуване от М = СМ
        double wsantimeters = w * 100;
        double hsantimeters = h * 100 - 100;


        double desck = Math.floor(hsantimeters / 70);
        double desck2 = Math.floor(wsantimeters / 120);
        double alldesck = desck * desck2 - 3;


        System.out.println(alldesck);


    }

}
