package Tasks;

import Tasks.Enums.Direction;

import static java.lang.System.out;

/**
 * Задание 11
 * Напишите метод, который отображает горизонтальную или вертикальную линию из некоторого символа.
 * Метод принимает в качестве параметра: длину линии,
 * направление, символ.
 */

public class Task11 {
    public static void printLine(int length, Direction direction, char sign) {
        if (direction == Direction.HORIZONT) {
            for (int i = 0; i < length; i++) {
                out.print(sign + " ");
            }
            out.println();
        } else if (direction == Direction.VERTICAL) {
            for (int i = 0; i < length; i++) {
                out.println(sign + "");
            }
        }
    }

    public static void main(String[] args) {
        out.println("Task11");
        Task11.printLine(5, Direction.HORIZONT, '$');
        Task11.printLine(6, Direction.VERTICAL, '#');
        Task11.printLine(5, Direction.HORIZONT, '$');
    }
}

