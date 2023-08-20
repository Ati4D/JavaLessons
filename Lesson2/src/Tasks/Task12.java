package Tasks;

import MyTools.MyInputTool;
import MyTools.MyIntArray;

import static java.lang.System.out;

/**
 * Задание 12
 * Напишите метод, сортирующий массив по убыванию
 * или возрастанию в зависимости от выбора пользователя.
 */

public class Task12 {
    public static void bubbleSort(int[] arr, boolean increase) {
        int n = arr.length;
        int temp;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (increase ? (arr[j - 1] > arr[j]) : (arr[j - 1] < arr[j])) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }

            }
        }

    }

    public static void main(String[] args) {
        out.println("Task12");
        MyIntArray arr = new MyIntArray();
        arr.setRandom();
        arr.printArray();
        try {
            MyInputTool.input("Sort by (1 - increasing, 2 - falling)");
            int choice = MyInputTool.tryGetInputInt();
            if (choice == 1) {
                out.println("Sort by increasing");
                Task12.bubbleSort(arr.getArray(), true);
                arr.printArray();
            } else if (choice == 2) {
                out.println("Sort by falling");
                Task12.bubbleSort(arr.getArray(), false);
                arr.printArray();
            }
        } catch (Exception ex) {
            out.println(ex.getMessage());
        }
    }
}

