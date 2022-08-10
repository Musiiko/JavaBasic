package hillel.homework.hw8;
/*Написать консольный калькулятор с использованием методов (под каждую задачу написать метод):
Необходимо ввести с консоли 2 числа (можно целых). По сути метод должен быть один - просто
использовать его 2 раза для ввода каждого числа
Ввести операцию (+, -, *, /)
Произвести операцию над двумя числами.
Вывести на консоль результат операции.*/

import java.util.Scanner;

public class Calculator {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int num1 = getInt();
        int num2 = getInt();
        char operation = getOperation();
        int result = calc(num1, num2, operation);
        System.out.println("Operation result : " + result);
    }

    public static int getInt() {
        System.out.print("Enter the number : ");
        int num;
        if (scanner.hasNextInt()) {
            num = scanner.nextInt();
        } else {
            System.out.println("You made a mistake when entering a number. Try again.");
            scanner.next();//рекурсия
            num = getInt();
        }
        return num;
    }

    public static char getOperation() {
        System.out.print("Enter an operation : ");
        char operation;
        if (scanner.hasNext()) {
            operation = scanner.next().charAt(0);
        } else {
            System.out.print("You made a mistake while entering the transaction. Try again.");
            scanner.next();//рекурсия
            operation = getOperation();
        }
        return operation;
    }

    public static int calc(int num1, int num2, char operation) {
        int result;
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Operation not recognized. Re-enter.");
                result = calc(num1, num2, getOperation());//рекурсия
        }
        return result;
    }
}
