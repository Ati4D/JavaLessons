package Tasks;

import MyTools.MyInputTool;
import MyTools.MyInteger;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

/**
 * Задание 4
 * Пользователь вводит шестизначное число. Необходимо
 * поменять в этом числе первую и шестую цифры, а также
 * вторую и пятую цифры.
 * Например, 723895 должно превратиться в 593827.
 * Если пользователь ввел не шестизначное число требуется вывести сообщение об ошибке.
 */

public class Task4 {
    public static void printRecreatedNumber(int num) throws Exception {
        MyInteger myInt = new MyInteger(num);
        if (myInt.getLength() != 6) {
            throw new Exception("You enter INCORRECT number!!!");
        }
        myInt.replaceNums(0, 5);
        myInt.replaceNums(1, 4);
        out.println(myInt.getNum());
    }

    public static void main(String[] args) {
        out.println("Task4");
        try {
            MyInputTool.input("number (length = 6)");
            int num_6 = MyInputTool.tryGetInputInt();
            MyInputTool.printResult();
            Task4.printRecreatedNumber(num_6);
        } catch (Exception ex) {
            out.println(ex.getMessage());
        }
    }
}
