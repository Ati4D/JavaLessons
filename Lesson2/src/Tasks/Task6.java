package Tasks;

import MyTools.MyInputTool;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

/**
 * Задание 6
 * Пользователь вводит с клавиатуры количество метров. В зависимости от выбора пользователя программа
 * переводит метры в мили, дюймы или ярды.
 */

public class Task6 {

    public static double convertTo(double meters, int type) {
        double result;
        if (type == 1) {
            result = convertToMiles(meters);
        } else if (type == 2) {
            result = convertToIches(meters);
        } else if (type == 3) {
            result = convertToYards(meters);
        } else return -1.;
        return result;
    }

    static double convertToMiles(double meters) {
        return meters * 0.000621371192;
    }

    static double convertToIches(double meters) {
        return meters * 39.3700787;
    }

    static double convertToYards(double meters) {
        return meters * 1.0936133;
    }

    public static void main(String[] args) {
        out.println("Task6");
        try {
            MyInputTool.input("meters");
            double meters = MyInputTool.tryGetInputDouble();
            MyInputTool.input("convert to (1-miles, 2-iches, 3-yards)");
            int choice = MyInputTool.tryGetInputInt();
            MyInputTool.printResult(Task6.convertTo(meters, choice) + "");
        } catch (Exception ex) {
            out.println(ex.getMessage());
        }
    }
}
