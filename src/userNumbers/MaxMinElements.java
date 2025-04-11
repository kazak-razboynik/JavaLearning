package userNumbers;

import java.util.Scanner;
import java.util.Arrays;

public class MaxMinElements {
    public static void main (String args[]) {
        Scanner scanner = new Scanner(System.in); // подключаем сканнер

        System.out.println("Укажи размер массива:"); // уточняем размер массива
        int arraySize = scanner.nextInt();


        int[] userArray = new int[arraySize]; // создаем массив с размером указанным в переменной

        for (int i = 0; i < userArray.length; i++) { // цикл для заполнения массива
            String text = "Напиши число для " + (i + 1) + " элемента массива:";
            System.out.println(text);
            userArray[i] = scanner.nextInt();
        }

        Arrays.sort(userArray); // делаем сортировку массива

        var textMax = "Максимальный элемент: " + userArray[arraySize - 1];
        var textMin = "Минимальный элемент: " + userArray[0];

        System.out.println(textMax + "\n" + textMin); // выводим минимальное и максимальное число
    }
}

