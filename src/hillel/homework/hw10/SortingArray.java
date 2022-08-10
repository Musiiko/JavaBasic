package hillel.homework.hw10;
// Отсортировать массив целых чисел сортировкой выбором.

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SortingArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число. Размер массива от 1 до 100 : ");

        if (scanner.hasNextInt()) {
            int arrayLength = scanner.nextInt();
            if (arrayLength > 100) {
                System.out.println("Вы не верно ввели размер массива. Повторите ещё раз. ");
            } else {
                int[] array = new int[arrayLength];
                Random random = new Random();
                random.nextInt(100);
                System.out.println("Исходный массив: ");
                for (int i = 0; i < array.length; i++) {
                    array[i] = random.nextInt(100);
                    System.out.printf("%3d", array[i]);
                }

                System.out.println("\nОтсортированный массив: ");
                for (int step = 0; step < array.length; step++) {
                    int minIndex = step;
                    for (int i = step + 1; i < array.length; i++) {
                        if ((array)[minIndex] > array[i]) {
                            minIndex = i;
                        }
                    }
                    if (minIndex != step) {
                        int first = array[step];
                        array[step] = array[minIndex];
                        array[minIndex] = first;
                    }
                    System.out.println(Arrays.toString(array));
                }
            }
        }
    }
}
