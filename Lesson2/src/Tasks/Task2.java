package Tasks;

import MyTools.MyInputTool;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

/**
 * Задание 2
 * Пользователь вводит с клавиатуры два числа. Первое
 * число — это значение, второе число процент, который
 * необходимо посчитать. Например, мы ввели с клавиатуры
 * 50 и 10. Требуется вывести на экран 10 процентов от 50.
 * Результат: 5
 */

public class Task2 {
    public static void printPercentOfNumber(int num, int percent) {
        double result = (num * percent) / 100.;
        out.println(percent + "% of " + num + " is " + result);
    }

    public static void main(String[] args) {
        out.println("Task2");
        try {
            MyInputTool.input("number");
            int num = MyInputTool.tryGetInputInt();
            MyInputTool.input("percent");
            int percent = MyInputTool.tryGetInputInt();
            MyInputTool.printResult();
            Task2.printPercentOfNumber(num, percent);
        } catch (Exception ex) {
            out.println(ex.getMessage());
        }
    }
}
