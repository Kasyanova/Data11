/*
Напишите программу:

        1. Ввести первое число с клавиатуры и записать его в строковую переменную.

        2. Ввести второе число с клавиатуры и сохранить его в целочисленную переменную типа int.

        3. Сравнить 2 числа и вывести большее на экран

        4. Выведите также меньшее число на экран, предварительно переконвертировать его в тип double.
*/

package com.max.idea;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        String one = in.nextLine(); //ввести число и сохранить в строковую переменную

        System.out.println("Введите второе число: ");
        int two = in.nextInt(); //целочисленная переменная int

        int one2 = new Integer(one); //перевести первое число в int для сравнения
        int result = 0;
        if (one2>two) result = 1; //сравнить числа

        //вывести большее и меньшее число, поменяв у меньшего тип на double
        switch (result) {
            case 1:
                System.out.println(one2 + " больше");
                double two2 = two;
                System.out.println(two2 + " меньше");
                break;
            default:
                System.out.println(two + " больше");
                double one3 = one2;
                System.out.println(one3 + " меньше");
                break;
        }
    }
}