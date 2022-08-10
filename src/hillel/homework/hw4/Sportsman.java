package hillel.homework.hw4;
/*Человек подтягивается лесенкой: 1 раз, 2 раза, 3 раза, итд. (максимум 20 подходов)
- Подсчитать сколько он всего раз подтянется за N подходов, N задано с клавиатуры
- Вывести сколько времени займет N подходов
* каждое подтягивание занимает 5 секунд, перерыв 60 секунд.
* каждый следующий перерыв между подходами увеличивается на 20%
* вывести общее время в формате mm:ss (например 15:45) (пункт необязательный)
При вводе с консоли количества подходов проверять его на целый тип и на диапазон (от 1 до 20 включительно)*/

import java.util.Scanner;

public class Sportsman {
    public static void main(String[] args) {
        Scanner sport = new Scanner(System.in);
        System.out.print("Введите количество подходов от 1 до 20 : ");
        int n = sport.nextInt();
        if (n >= 1 && n <= 20) {
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                sum = sum + i;
            }
            System.out.println("Человек за выбранное количество подходов подтянулся = " + sum);
            int a = 5;
            int pullUp = sum * a;
            System.out.println("Время потраченное на подтягивание (секунд) = " + pullUp);
            int restTime = 60;
            restTime = restTime + (int) (restTime * 1.2);
            System.out.println("Время потраченное на перерыв между подходами (секунд) = " + restTime);
            int time = (pullUp + restTime) / 60;
            System.out.println("Общее время потраченное на подтягивание и отдых (минут/секунд) = " + time + ":"
                    + (pullUp + restTime) % 60);
        } else {
            System.out.println("Вы не верно ввели количество подходов. Повторите ещё раз.");
        }
    }
}




