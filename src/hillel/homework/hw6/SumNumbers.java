package hillel.homework.hw6;
/*Найти сумму всех цифр целочисленного массива (числа только положительные).
 Например, если дан массив [12, 104, 81], то сумма всех его цифр будет равна 1 + 2 + 1 + 0 + 4 + 8 + 1 = 17. */

import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int positives = 0;
        int[] array = {12, 104, 81};
        int i = 0;
        int sum = 0;
        for (i = 0; i < array.length; i++) {
            int temp = array[i];
            while (temp > 0) {
                sum = sum + temp % 10;
                temp = (temp / 10);
                positives++;
            }
        }
        System.out.println(sum);
    }
}


