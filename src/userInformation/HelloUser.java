package userInformation;

import java.util.Scanner;
public class HelloUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Как тебя зовут?");
        String userName = scanner.nextLine();
        // Принимаем данные об имени пользователя

        System.out.println("Сколько тебе лет? Напиши число");
        int userAge = scanner.nextInt();
        // Принимаем данные о возрасте пользователя
        int userAgeFromOneHundred = 100 - userAge;
        // Проводим вычисление разницы возраста от 100 лет

        System.out.println("Какой у тебя вес? Напиши целое число в килограммах");
        int userWeight = scanner.nextInt();
        // Принимаем данные о весе пользователя

        String textHello = "Привет, " + userName + "! ";
        String textAge = "Через " + userAgeFromOneHundred + " лет тебе будет 100 лет. ";
        String textWeight = "Сейчас ты весишь " + userWeight + " кг.";
        System.out.println(textHello + textAge + textWeight);
    }
}
