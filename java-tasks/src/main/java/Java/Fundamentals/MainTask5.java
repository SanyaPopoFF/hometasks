package Java.Fundamentals;

import java.util.Scanner;

/*
Ввести число от 1 до 12. Вывести на консоль название месяца, соответствующего данному числу.
 Осуществить проверку корректности ввода чисел.
 */
public class MainTask5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число от 1 до 12: ");
        int num1 = in.nextInt();

        if (num1 > 0 && num1 < 13) {
            String Month[] = {"январь", "феваль", "март", "апрель", "май", "июнь",
                    "июль", "август", "сентябрь", "октябрь", "ноябрь", "декабрь"};
            String s;
            s = Month[num1 - 1];
            System.out.println(s);
        } else {
            System.out.println("Вы ввели неверное число");
        }
    }
}