package hillel.homework.hw2;
/* Написать программу, которая принимает с консоли рост и вес человека
и считает индекс массы тела, который в свою очередь выводится в консоль.
 */

import java.util.Locale;
import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        Scanner indexbody = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Введите рост человека: ");
        double growth = indexbody.nextDouble();

        System.out.print("Введите массу тела: ");
        int bodymass = indexbody.nextInt();

        double indexbodymass = bodymass / (growth * growth);
        System.out.println("indexbodymass=" + indexbodymass);

        if (indexbodymass <= 16) {
            System.out.println("Выраженный дефицит массы тела");
        } else {
            if (indexbodymass <= 18.5) {
                System.out.println("Недостаточная масса тела");
            } else {
                if (indexbodymass <= 25) {
                    System.out.println("Норма");
                } else {
                    if (indexbodymass < 30) {
                        System.out.println("Масса тела выше нормы");
                    } else {
                        System.out.println("Срочно худать");
                    }
                }
            }
        }
    }
}


