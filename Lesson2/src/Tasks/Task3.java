package Tasks;

import MyTools.MyInputTool;
import MyTools.MyInteger;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

/**
 * Задание 3
 * Пользователь вводит с клавиатуры три цифры. Необходимо создать число, содержащее эти цифры. Например,
 * если с клавиатуры введено 7, 3, 8, тогда нужно сформировать число 738.
 */

public class Task3 {
    public static void printCombinedNumber(int num1, int num2, int num3) {
        MyInteger result = new MyInteger(new int[]{num1, num2, num3});
        out.println(num1 + ";" + num2 + ";" + num3 + "; ===> " + result.getNum());
    }

    public static void main(String[] args) {
        out.println("Task3");
        try {
            MyInputTool.input("num1");
            int num1 = MyInputTool.tryGetInputInt();
            MyInputTool.input("num2");
            int num2 = MyInputTool.tryGetInputInt();
            MyInputTool.input("num3");
            int num3 = MyInputTool.tryGetInputInt();
            MyInputTool.printResult();
            Task3.printCombinedNumber(num1, num2, num3);
        } catch (Exception ex) {
            out.println(ex.getMessage());
        }
    }
}
