package Java.Fundamentals;

import java.util.Scanner;

/*
Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение) и вывести результат на консоль.
 */
public class MainTask4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = in.nextInt();
        int arr[] = new int[num];
        for (int i = 0; i < arr.length; i++) {
            int a = 0;
            int b = 10;
            int random_number = a + (int) (Math.random() * b);
            arr[i] = random_number;
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
        for (int y = 0; y < arr.length; y++) {
            System.out.println(arr[y]);
        }
    }
}