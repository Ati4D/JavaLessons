package Tasks;

import MyTools.MyIntArray;

import static java.lang.System.out;

/**
 * Задание 10
 * Есть одномерный массив, заполненный случайными
 * числами. На основании данных этого массива нужно:
 * ■ Создать одномерный массив, содержащий только
 * четные числа из первого массива;
 * ■ Создать одномерный массив, содержащий только
 * нечетные числа из первого массива;
 * ■ Создать одномерный массив, содержащий только
 * отрицательные числа из первого массива;
 * ■ Создать одномерный массив, содержащий только
 * положительные числа из первого массива.
 */

public class Task10 {
    public static void printArrays() {
        MyIntArray arr = new MyIntArray();
        arr.setRandom();
        MyIntArray evens = new MyIntArray(arr.getEvensArray());
        MyIntArray odds = new MyIntArray(arr.getOddsArray());
        MyIntArray negatives = new MyIntArray(arr.getNegativeArray());
        MyIntArray positives = new MyIntArray(arr.getPositiveArray());

        out.print("Random ");
        arr.printArray();
        out.print("Evens ");
        evens.printArray();
        out.print("Odds ");
        odds.printArray();
        out.print("Negatives ");
        negatives.printArray();
        out.print("Positives ");
        positives.printArray();
    }

    public static void main(String[] args ){
        out.println("Task10");
        Task10.printArrays();
    }
}
