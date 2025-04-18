package Collections;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class StudentCollection {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> students = new LinkedList<>();
        boolean sayYes = true;

        while(sayYes) {
            System.out.println("Напиши ФИО студента (например: Иванов.И.И.):");
            students.add(scanner.next());

            System.out.println("Хочешь добавить еще одного студента? y/n");
            String question = scanner.next();

            if (!question.equalsIgnoreCase("y")) {
                sayYes = false;
            }
        }
        String resultText = "Вот коллекция которую мы сделали:\n" + students;

        System.out.println(resultText);

    }
}
