package com.company.Practice;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

import static java.lang.System.*;

public class StringTest {
    public static void main(String[] args) {

        String string1 = "Literal variant";
        String string2 = new String("New variant");
        String string3 = new String(new char[]{'c', 'a', 'r', ' ', 'v', 'a', 'r', 'i', 'a', 'n', 't'});
        String string4 = new String(new byte[]{65, 66, 67, 68, 69}, StandardCharsets.UTF_8);
        StringBuilder stringBuilder = new StringBuilder("StringBuilder variant");

        String stroka = "Апельсин,Яблоко,Гранат,Груша";
        String[] words = stroka.split(",");
        int maxL = words[0].length();
        String maxW = new String(words[0]);
        for (var word : words) {
            if (word.length() > maxL) {
                maxL = word.length();
                maxW = word;
            }
        }
        String lowerMaxW = maxW.toLowerCase();
        out.println(lowerMaxW);
        out.println("Short variant: " + lowerMaxW.substring(0, 3));

        String srokaNew = "   Я_новая_строка      ";
        srokaNew = srokaNew.strip();
        srokaNew = srokaNew.replaceAll("_", " ");
        out.println(srokaNew);

        Scanner scanner = new Scanner(in);
        String input = scanner.nextLine();
        String[] inputWords = input.split(" ");
        for (var word : inputWords) {
            word = word.trim();
        }

        out.println("Вы ввели: " + input);

        if (inputWords[0].compareTo("Запуск") == 0) {
            out.println("Запускаем процесс");
        }

        String lastWord = inputWords[inputWords.length - 1];
        if (!Character.isAlphabetic(lastWord.charAt(lastWord.length() - 1))) {
            lastWord = lastWord.substring(0, lastWord.length() - 1);
        }

        for (var word : inputWords) {
            if (word.compareToIgnoreCase("ошибка") == 0) {
                out.println("Произошла ошибка");
                break;
            }
        }

        if (lastWord.compareTo("завершен") == 0) {
            out.println("Процесс завершен");
        }

        String[] allStrings = {
                "Literal variant",
                "New variant",
                string3,
                string4,
                stringBuilder.toString(),
                stroka,
                srokaNew,
                input,
                "Запускаем процесс",
                "Произошла ошибка",
                "Процесс завершен",
        };

        StringBuilder builder = new StringBuilder();
        int i = 0;
        for (var string : allStrings) {
            i += 1;
            if (i == 3) {
                builder.append(string).append("\n");
                i = 0;
            } else {
                builder.append(string).append("\t");
            }
        }
        builder.reverse();
        String builderString = builder.toString();
        out.println(builderString);
    }
}
