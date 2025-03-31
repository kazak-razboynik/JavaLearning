package userNumbers;

import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args) {
        EvenNumbers.sum();
    }

    public static void sum() {
        Scanner scanner = new Scanner(System.in);
        int N;

        System.out.println("Напиши число");
        N = scanner.nextInt();
        //Получаем число от пользователя

        if (N % 2 == 0) {
            System.out.println("Это четное число");
        } else {
            System.out.println("Это нечетное число");
        }
    }
}