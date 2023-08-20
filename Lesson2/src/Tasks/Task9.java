package Tasks;

import MyTools.MyIntArray;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

/**
 * Задание 9
 * В одномерном массиве, заполненном случайными
 * числами, определить минимальный и максимальный
 * элементы, посчитать количество отрицательных элементов,
 * посчитать количество положительных элементов, посчитать количество нулей.
 * Результаты вывести на экран.
 */

public class Task9 {
    public static void generateArrayAndPrintStatistic(){
        MyIntArray arr = new MyIntArray();
        arr.setRandom();
        arr.printArray();
        printStatistic(arr);
    }
    static void printStatistic(MyIntArray arr){
        out.println("Statistic");
        out.println("min element = " + arr.getMin());
        out.println("max element = " + arr.getMax());
        out.println("number of negative elements = " + arr.getNegativeNum());
        out.println("number of positive elements = " + arr.getPositiveNum());
        out.println("number of zero elements = " + arr.getZerosNum());
    }

    public static void main(String[] args ){
        out.println("Task9");
        Task9.generateArrayAndPrintStatistic();
    }
}
