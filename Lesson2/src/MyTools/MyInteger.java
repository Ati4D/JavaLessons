package MyTools;

public class MyInteger {
    private int num;

    public MyInteger(int i) {
        setNum(i);
    }

    public MyInteger(int[] arr) {
        setNum(arr);
    }

    public int[] toArray() {
        var numsInChars = (num + "").toCharArray();
        int[] arr = new int[numsInChars.length];
        for (int i = 0; i < numsInChars.length; i++) {
            arr[i] = Integer.parseInt(numsInChars[i] + "");
        }
        return arr;
    }

    public void replaceNums(int index1, int index2) {
        int result;
        var arr = toArray();
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
        this.num = arr[0];
        for (int i = 1; i < arr.length; i++) {
            combineNum(arr[i]);
        }
    }

    private void combineNum(int num) {
        int thisNum = this.num;
        this.num = num;
        int zeroNumber = toArray().length;
        int nm = 1;
        for (int i = 0; i < zeroNumber; i++) {
            nm *= 10;
        }
        thisNum *= nm;
        thisNum += num;
        this.num = thisNum;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setNum(int[] num) {
        this.num = num[0];
        for (int i = 1; i < num.length; i++) {
            combineNum(num[i]);
        }
    }

    public int getNum() {
        return this.num;
    }

    public int getLength() {
        return toArray().length;
    }
}
