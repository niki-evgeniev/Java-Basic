package ConditionalStatementsExercise;

import java.util.Scanner;

public class GodzillavsKong_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int statist = Integer.parseInt(scanner.nextLine());
        double clothing = Double.parseDouble(scanner.nextLine());
        //Снимките за дългоочаквания филм "Годзила срещу Конг" започват. Сценаристът Адам Уингард ви моли да напишете програма,
        // която да изчисли дали предвидените средства са достатъчни за снимането на филма. За снимките
        // ще бъдат нужни определен брой статисти, облекло за всеки един статист и декор.
        //Известно е, че:
        //•	Декорът за филма е на стойност 10% от бюджета.
        //•	При повече от 150 статиста,  има отстъпка за облеклото на стойност 10%.
        double decor = budget * 0.1;
        double priceclothing = clothing * statist;
        if (statist > 150) {
            priceclothing = priceclothing - (priceclothing * 0.1);
        }
        double total = priceclothing + decor;
        if (total <= budget) {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", budget - total);
        } else {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", total - budget);
        }


    }
}
