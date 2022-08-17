package AdvancedExercise;

import java.util.Scanner;

public class NewHouse_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nameflower = scanner.nextLine();
        int numberflower = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());
        double totalprice = 0;

        //цвете             	Роза	        Далия   	Лале    	Нарцис	    Гладиола
        //Цена на брой в лева	5	             3.80	    2.80	       3        	2.50
        //Съществуват следните отстъпки:
        //•	Ако Нели купи повече от 80 Рози - 10% отстъпка от крайната цена
        //•	Ако Нели купи повече от 90  Далии - 15% отстъпка от крайната цена
        //•	Ако Нели купи повече от 80 Лалета - 15% отстъпка от крайната цена
        //•	Ако Нели купи по-малко от 120 Нарциса - цената се оскъпява с 15%
        //•	Ако Нели Купи по-малко от 80 Гладиоли - цената се оскъпява с 20// %//
        // •	Вид цветя - текст с възможности - "Roses", "Dahlias", "Tulips", "Narcissus", "Gladiolus"
        switch (nameflower) {
            case "Roses":
                totalprice = numberflower * 5;
                if (numberflower > 80) {
                    totalprice = totalprice - totalprice * 0.1;
                }
                break;
            case "Dahlias":
                totalprice = numberflower * 3.80;
                if (numberflower > 90) {
                    totalprice = totalprice - totalprice * 0.15;
                }
                break;
            case "Tulips":
                totalprice = numberflower * 2.80;
                if (numberflower > 80) {
                    totalprice = totalprice - totalprice * 0.15;
                }
                break;
            case "Narcissus":
                totalprice = numberflower * 3.00;
                if (numberflower < 120) {
                    totalprice = totalprice + totalprice * 0.15;
                }
                break;
            case "Gladiolus":
                totalprice = numberflower * 2.50;
                if (numberflower < 80) {
                    totalprice = totalprice + totalprice * 0.2;
                }
                break;

        }
        if (totalprice <= budget){
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.",numberflower,nameflower, budget -totalprice);
        }else if (totalprice >= budget){
            System.out.printf("Not enough money, you need %.2f leva more.", totalprice - budget);
        }



    }
}
