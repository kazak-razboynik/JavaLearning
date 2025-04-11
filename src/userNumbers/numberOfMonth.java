package userNumbers;

import java.util.Scanner;

public class numberOfMonth {
    public static void main (String args[]) {

        Scanner scanner = new Scanner(System.in);
        boolean sayYes = true;

        while(sayYes){
            System.out.println("Напиши номер от 1 до 12 для вывода названия месяца");
            var month = scanner.nextInt();

            switch (month) {
                case 1:
                    System.out.println("Январь");
                    break;
                case 2:
                    System.out.println("Февраль");
                    break;
                case 3:
                    System.out.println("Март");
                    break;
                case 4:
                    System.out.println("Апрель");
                    break;
                case 5:
                    System.out.println("Май");
                    break;
                case 6:
                    System.out.println("Июнь");
                    break;
                case 7:
                    System.out.println("Июль");
                    break;
                case 8:
                    System.out.println("Август");
                    break;
                case 9:
                    System.out.println("Сентябрь");
                    break;
                case 10:
                    System.out.println("Октябрь");
                    break;
                case 11:
                    System.out.println("Ноябрь");
                    break;
                case 12:
                    System.out.println("Декабрь");
                    break;
                default:
                    continue;
            }

            System.out.println("Хочешь продолжить? y/n");
            //scanner.nextLine();
            String answer = scanner.next();

            if (!answer.equalsIgnoreCase("y")) {
                sayYes = false;
            }
        }
    }
}

