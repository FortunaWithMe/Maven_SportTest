package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        TestsList sport = new Sport();
        Scanner scanner = new Scanner(System.in);
        int result = 0;
        System.out.println("Давай дізнаємось наскільки ти дружиж з спортом:");
        System.out.println("1. Давай" + "\n" + "2. Наступного разу");
        result = scanner.nextInt();
        if (result == 1) {
            sport.test();
        }
        if (result == 2) {
            System.out.println("Тоді до зустрічі");
        }
    }
}