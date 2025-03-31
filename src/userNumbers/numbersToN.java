package userNumbers;

import java.util.Scanner;

public class numbersToN {
    public static void main(String[] args) {
        numbersToN.sum();
    }

    public static void sum() {
        Scanner scanner = new Scanner(System.in);
        int N;

        while (true) {
            System.out.println("Напиши число равное или больше 1:");
            N = scanner.nextInt();
            //Получаем число от пользователя

            if (N >= 1) {
                break;
            } else {
                System.out.println("Число меньше 1, введи число равное 1 или более");
            }
        }

        for (int i = 1; i <= N; i++) {
            System.out.println(i);
            // Выдаем числа от 1 до N
            }
        }
    }
// Числа от 1 до N