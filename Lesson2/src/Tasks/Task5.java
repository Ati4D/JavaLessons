package Tasks;

import MyTools.MyInputTool;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

/**
 * Задание 5
 * Пользователь вводит с клавиатуры номер месяца (от
 * 1 до 12). В зависимости от полученного номера месяца
 * программа выводит на экран надпись: Winter (если введено
 * значение 1,2 или 12), Spring (если введено значение от 3
 * до 5), Summer (если введено значение от 6 до 8), Autumn
 * (если введено значение от 9 до 11).
 * Если пользователь ввел значение не в диапазоне от 1
 * до 12 требуется вывести сообщение об ошибке.
 */

public class Task5 {
    public static void printMonthOfIndex(int monthIndex) throws Exception {
        if (monthIndex < 1 || monthIndex > 12) {
            throw new Exception("INCORRECT index of month!!!");
        }
        String monthName = "";
        switch (monthIndex) {
            case 12:
            case 1:
            case 2:
                monthName = "Winter";
                break;
            case 3:
            case 4:
            case 5:
                monthName = "Spring";
                break;
            case 6:
            case 7:
            case 8:
                monthName = "Summer";
                break;
            case 9:
            case 10:
            case 11:
                monthName = "Autumn";
                break;
        }
        out.println(monthName);
    }

    public static void main(String[] args) {
        out.println("Task5");
        try {
            MyInputTool.input("index of month (1 - 12)");
            int monthIndex = MyInputTool.tryGetInputInt();
            MyInputTool.printResult();
            Task5.printMonthOfIndex(monthIndex);
        } catch (Exception ex) {
            out.println(ex.getMessage());
        }
    }
}
