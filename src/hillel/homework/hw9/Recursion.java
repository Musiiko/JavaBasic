package hillel.homework.hw9;
// Вычислить степень числа с помощью рекурсивной функции

import java.util.Scanner;

public class Recursion {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int num = getInt();
        int degree = degreeInt();
        int power = PowA(num, degree);
        System.out.println("Result (" + num + " ^ " + degree + ")= " + power);
    }

    public static int getInt() {
        System.out.print("Enter an integer : ");
        int num;
        if (scanner.hasNextInt()) {
            num = scanner.nextInt();
        } else {
            System.out.println("You have entered an integer. Try again.");
            scanner.next();
            num = getInt();
        }
        return num;
    }

    public static int degreeInt() {
        System.out.print("Enter the degree : ");
        int degree;
        if (scanner.hasNextInt()) {
            degree = scanner.nextInt();
        } else {
            System.out.println("You have entered the same degree. Try again.");
            scanner.next();
            degree = getInt();
        }
        return degree;
    }

    public static int PowA(int num, int degree) {

        if (degree == 0)
            return 1;
        return PowA(num, degree - 1) * num;
    }
}



