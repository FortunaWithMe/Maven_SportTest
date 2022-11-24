package org.example;

import java.util.Scanner;

public class Sport implements TestsList {

    Scanner scanner = new Scanner(System.in);
    int result = 0;
    int counter = 0;

    @Override
    public void test() {

        System.out.println("Скільки білка на добу потрібно на 1 кг твоєї ваги");
        System.out.println("1) 2 грами" + "\n"
                         + "2) 3 грами" + "\n"
                         + "3) 4 грами");
        result = scanner.nextInt();
        if (result == 1) {
            counter++;
        }
        System.out.println("Як підвищити метаболізм");
        System.out.println("1) Їсти солодке" + "\n"
                         + "2) Багато рухатись" + "\n"
                         + "3) Спати 8 годин на добу");
        result = scanner.nextInt();
        if (result == 2) {
            counter++;
        }
        System.out.println("Яка оптимальна швідкість пульсу для схудення");
        System.out.println("1) 120 ударів на хвилину" + "\n"
                         + "2) 150 ударів на хвилину" + "\n"
                         + "3) 180 ударів на хвилину");
        result = scanner.nextInt();
        if (result == 2) {
            counter++;
        }
        System.out.println("Що ж, правильних відповідей: " + counter);
    }
}
