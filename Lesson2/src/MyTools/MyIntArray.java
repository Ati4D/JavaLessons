package MyTools;

import static java.lang.System.out;

public class MyIntArray {
    int[] arr;

    public MyIntArray() {
        arr = new int[30];
    }

    public MyIntArray(int[] arr) {
        this.arr = arr;
    }

    public void SortArray() {

    }

    public void printArray() {
        out.print("Array: ");
        for (int i : arr) {
            out.print("[" + i + "]");
        }
        out.println();
    }

    public void setRandom() {
        int max = 10;
        int min = -10;
        int range = max - min + 1;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * range) + min;
        }
    }

    public void setRandom(int max, int min) {
        int range = max - min + 1;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * range) + min;
        }
    }

    public int getMax() {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public int getMin() {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public int getOddsNum() {
        int odds = 0;
        for (int i : arr) {
            if (i % 2 != 0) {
                odds += 1;
            }
        }
        return odds;
    }

    public int getEvensNum() {
        int evens = 0;
        for (int i : arr) {
            if (i % 2 == 0) {
                evens += 1;
            }
        }
        return evens;
    }

    public int getZerosNum() {
        int zeros = 0;
        for (int i : arr) {
            if (i == 0) {
                zeros += 1;
            }
        }
        return zeros;
    }

    public int getNegativeNum() {
        int negative = 0;
        for (int i : arr) {
            if (i < 0) {
                negative += 1;
            }
        }
        return negative;
    }

    public int getPositiveNum() {
        int positive = 0;
        for (int i : arr) {
            if (i > 0) {
                positive += 1;
            }
        }
        return positive;
    }

    public int[] getOddsArray() {
        int[] odds = new int[getOddsNum()];
        int j = 0;
        for (int i : arr) {
            if (i % 2 != 0) {
                odds[j] = i;
                j += 1;
            }
        }
        return odds;
    }

    public int[] getEvensArray() {
        int[] evens = new int[getEvensNum()];
        int j = 0;
        for (int i : arr) {
            if (i % 2 == 0) {
                evens[j] = i;
                j += 1;
            }
        }
        return evens;
    }

    public int[] getPositiveArray() {
        int[] positives = new int[getPositiveNum()];
        int j = 0;
        for (int i : arr) {
            if (i > 0) {
                positives[j] = i;
                j += 1;
            }
        }
        return positives;
    }

    public int[] getNegativeArray() {
        int[] negatives = new int[getNegativeNum()];
        int j = 0;
        for (int i : arr) {
            if (i < 0) {
                negatives[j] = i;
                j += 1;
            }
        }
        return negatives;
    }

    public int[] getArray() {
        return arr;
    }
}
