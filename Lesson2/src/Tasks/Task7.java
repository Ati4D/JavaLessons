package Tasks;

import MyTools.MyInputTool;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

/**
 * Задание 7
 * Пользователь вводит с клавиатуры два числа. Нужно
 * показать все нечетные числа в указанном диапазоне. Если
 * границы диапазона указаны неправильно требуется произвести нормализацию границ. Например, пользователь
 * ввел 20 и 11, требуется нормализация, после которой
 * начало диапазона станет равно 11, а конец 20.
 */

public class Task7 {
    public static void printAllOddNums(int start, int end) {
        int first = start;
        int last = end;
        if (start > end) {
            first = end;
            last = start;
        }
        for (int i = first; i <= last; i++) {
            if (i % 2 != 0)
                out.print(i + ";");
        }
        out.println();
    }

    public static void main(String[] args) {
        out.println("Task7");
        try {
            MyInputTool.input("start num");
            int start = MyInputTool.tryGetInputInt();
            MyInputTool.input("end num");
            int end = MyInputTool.tryGetInputInt();
            MyInputTool.printResult();
            Task7.printAllOddNums(start, end);
        } catch (Exception ex) {
            out.println(ex.getMessage());
        }
    }
}
