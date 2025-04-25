package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentCollection {

    private static void printMenu() {
        // Выводим меню выбора опций работы с программой
        System.out.println("""
            Для работы с коллекцией студентов выбери пункт:"
            1 - Добавить ФИО студента
            2 - Вывести коллекцию студентов
            3 - Удалить ФИО студента
            0 - Завершить работу программы""");
    }

    // Метод для обработки логики 1 пункта
    private static void firstNumberOfMenu(Scanner scanner, List<String> list) {
        scanner.nextLine();
        System.out.println("Напиши ФИО студента:");
        String name = scanner.nextLine().trim();
        if (name.isEmpty()) {
            System.out.println("Нет данных для добавления");
            return;
        }
        list.add(name);
        System.out.println("Записано");
    }

    // Метод для обработки логики 3 пункта
    private static void thirdNumberOfMenu(Scanner scanner, List<String> list) {
        String text = "Введите номер записи для ее удаления (1-" + (list.size()) + "):";
        if (list.isEmpty()) {
            System.out.println("Нет данных для удаления");
            return;
        }
        System.out.println(text);

        if (scanner.hasNextInt()){
            int idStudent = scanner.nextInt();
            scanner.nextLine();

            if (idStudent >= 1 && idStudent <= list.size()) {
             System.out.println("Удален: " + list.remove(idStudent - 1));
            } else {
                System.out.println("Нет записи под таким номером");
            }
        } else {
            System.out.println("Это не является числом");
            scanner.next();
        }
    }

    // Метод для обработки логики 2 пункта
    private static void secondNumberOfMenu(List<String> list) {
        if (list.isEmpty()) {
            System.out.println("Данных нет.");
        } else {
            System.out.println("Вот студенты которых мы записали:\n" + list);
        }
    }

    //Метод для вывода текста при 0 пункте завершения работы
    private static void zeroNumberOfMenu() {
        var sayBye = "До скорой встречи!";
        System.out.println(sayBye);
    }

    // Метод для вывода текста при некорректно выбранном меню
    private static void wrongNumberOfMenu() {
        var sayWongNumber = "Неправильный номер меню. Выбери из предоставленных номеров!";
        System.out.println(sayWongNumber);
    }

    public static void main(String[] args) {
        // Подключаем сканнер и создаем коллекцию
        Scanner scanner = new Scanner(System.in);
        List<String> students = new ArrayList<>();

        boolean run = true;

        System.out.println("Привет!");

        while(run) {
            printMenu();
            // Проверяем содержит ли ввод числа
                // Цикл для обработки логики каждого пункта
                switch (scanner.nextInt()) {
                    case 1 ->
                            firstNumberOfMenu(scanner, students);
                    case 2 ->
                            secondNumberOfMenu(students);
                    case 3 ->
                            thirdNumberOfMenu(scanner, students);
                    case 0 -> {
                            run = false;
                            zeroNumberOfMenu();
                    }
                    default ->
                            wrongNumberOfMenu();
                }
            }
        }
    }

