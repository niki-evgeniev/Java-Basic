package FirstMoreExercises;

import java.util.Scanner;

public class HousePainting_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        //•	Предната и задната стена са квадрати със страна „x“
        //o	на предната стена има правоъгълна врата с широчина 1.2м и височина 2м
        //•	Страничните стени са правоъгълници със страни „x“ и „y“
        //o	и на двете странични стени има по един квадратен прозорец със страна 1.5м
        //Покривът има следните размери:
        //•	Два правоъгълника със страни „x“ и „y“
        //•	Два равностранни триъгълника със страна „x“ и височина „h“
        //Трябва да пресметнете площта на всички страни и площта на покрива, за да
        //намерите колко литра от всяка боя ще са нуни.

        //предна стени
        double prednaStr = x * x - 1.2 * 2 + x * x;
        //странични стени
        double stranichniStr = (x * y - 1.5 * 1.5) * 2;
        //общо зелена боя
        double totalgreenpain = (stranichniStr + prednaStr) / 3.4;
        //покрив
        //страници ( правоъгълниците)
        double pokrivPravougulnik = (x * y) * 2;
        double pokrivTriugul = (x * h / 2) * 2;
        double totalredpaint = (pokrivPravougulnik + pokrivTriugul) / 4.3;
        System.out.printf("%.2f %n%.2f", totalgreenpain, totalredpaint);

    }
}
