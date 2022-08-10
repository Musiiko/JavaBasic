package hillel.homework.hw3;
/* Ввести с консоли оценку в 12-бальной шкале и вывести на консоль её аналог в 5-бальной.
Возьмем за правило что:
12,11,10 = 5
9,8,7 = 4
6,5,4 = 3
3,2,1 = 2
Проверять корректность вводимой оценки на диапазон (от 1 до 12) и на вводимый тип. */

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner school = new Scanner(System.in);
        System.out.print("Введите оценку по двенадцати бальной шкале : ");
        int number = school.nextInt();
        switch (number) {
            case 1:
            case 2:
            case 3: {
                System.out.println("Оценка 2");
                break;
            }
            case 4:
            case 5:
            case 6: {
                System.out.println("Оценка 3");
                break;
            }
            case 7:
            case 8:
            case 9: {
                System.out.println("Оценка 4");
                break;
            }
            case 10:
            case 11:
            case 12: {
                System.out.println("Оценка 5");
                break;
            }
            default: {
                System.out.println("Такой оценки нет. Введите ещё раз.");
            }
        }
    }
}
