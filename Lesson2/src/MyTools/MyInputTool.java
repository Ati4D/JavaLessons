package MyTools;

import java.util.Scanner;

import static java.lang.System.*;

public class MyInputTool {
    public static void input(String text) {
        out.print("Please input " + text + ": ");
    }

    public static int tryGetInputInt() throws Exception {
        Scanner scanner = new Scanner(in);
        try {
            return scanner.nextInt();
        } catch (Exception e) {
            throw new Exception("Error: incorrect input type");
        }
    }

    public static double tryGetInputDouble() throws Exception {
        Scanner scanner = new Scanner(in);
        try {
            return scanner.nextDouble();
        } catch (Exception e) {
            throw new Exception("Error: incorrect input type");
        }
    }

    public static void printResult(String res) {
        out.println("Your result is " + res);
    }

    public static void printResult() {
        out.print("Your result is ");
    }
}
