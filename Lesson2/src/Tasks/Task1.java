package Tasks;

import static java.lang.System.out;

/**
 * Задание 1
 * Выведите на экран надпись "Your time is limited, so
 * don’t waste it living someone else’s life" Steve Jobs на разных
 * строках. Пример вывода:
 * “Your time is limited,
 * so don’t waste it
 * living someone else’s life”
 * Steve Jobs
 */

public class Task1 {
    public static void printWords() {
        out.println("\"Your time is limited,\n\t so don’t waste it\n\t\t living someone else’s life\"\n\t\t\t Steve Jobs");
    }

    public static void main(String[] args) {
        out.println("Task1");
        Task1.printWords();
    }
}
