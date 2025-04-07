package userNumbers;

import java.util.Scanner;

public class WhatDayOfTheWeek {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean continueInput = true;

        while (continueInput) {
            System.out.println("Введи число дня недели (от 1 до 7):");

            int dayNumber = scanner.nextInt();

            String dayName;

            switch (dayNumber) {
                case 1:
                    dayName = "Понедельник";
                    break;
                case 2:
                    dayName = "Вторник";
                    break;
                case 3:
                    dayName = "Среда";
                    break;
                case 4:
                    dayName = "Четверг";
                    break;
                case 5:
                    dayName = "Пятница";
                    break;
                case 6:
                    dayName = "Суббота";
                    break;
                case 7:
                    dayName = "Воскресенье";
                    break;
                default:
                    dayName = "Некорректное число. Введите от 1 до 7.";
            }

            System.out.println(dayName);

            System.out.println("Хочешь ввести еще одно число? (y/n):");
            scanner.nextLine();
            String continueOfDayNumber = scanner.nextLine();

            if (!continueOfDayNumber.equalsIgnoreCase("y")) {
                continueInput = false;
                System.out.println("Пока!");
            }
        }
        scanner.close();
    }
}