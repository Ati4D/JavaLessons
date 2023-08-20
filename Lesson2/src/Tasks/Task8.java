package Tasks;

import MyTools.MyInputTool;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

/**
 * Задание 8
 * Показать на экран таблицу умножения в диапазоне,
 * указанном пользователем. Например, если пользователь
 * указал 3 и 5, таблица может выглядеть так:
 * 3*1 = 3 3*2 = 6 3*3 = 9 ………… 3* 10 = 30
 * ……………………………………………………
 * 5*1 = 5 5 *2 = 10 5 *3 = 15 ………….
 */

public class Task8 {
    public static void printTable(int start, int end) {
        for (int i = start; i <= end; i++) {
            printRow(i);
        }
    }

    static void printRow(int num) {
        for (int i = 1; i <= 10; i++) {
            out.print(num + "*" + i + "=" + (num * i) + " : ");
        }
        out.println();
    }

    public static void main(String[] args) {
        out.println("Task8");
        try {
            MyInputTool.input("start num");
            int first = MyInputTool.tryGetInputInt();
            MyInputTool.input("end num");
            int last = MyInputTool.tryGetInputInt();
            MyInputTool.printResult();
            out.println();
            Task8.printTable(first, last);
        } catch (Exception ex) {
            out.println(ex.getMessage());
        }
    }
}
