import java.util.Scanner;

public class arrayGenerator {
    private int[] arrayGlobal;
    private int arrayLength;

    public arrayGenerator(int n) {
        this.arrayGlobal = new int[n];
        arrayLength = n;
    }

    public int[] getArray() {
        return arrayGlobal;
    }

    public void getInteger(int index, int value) {
        arrayGlobal[index] = value;
        System.out.println("index " + index + ", value " + value);
    }

    public void printArray() {
        for (int i = 0; i < arrayLength; i++) {
            System.out.print(arrayGlobal[i] + " ");
        }
    }

    public int findMin() {
        int minValue = Integer.MAX_VALUE;
        for (int i = 0; i < arrayLength; i++) {
            minValue = Math.min(minValue, arrayGlobal[i]);
        }
        return minValue;
    }

    public int findMax() {
        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < arrayLength; i++) {
            maxValue = Math.max(maxValue, arrayGlobal[i]);
        }
        return maxValue;
    }

    public int[] reverseArray() {
        int[] reverseArr = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            reverseArr[i] = arrayGlobal[arrayLength - 1 - i];
        }
        return reverseArr;
    }

    public int[] sortIntegers() { // sort array in descending order
        int[] tmpArray = arrayGlobal.clone();
        for(int i = tmpArray.length - 1; i >= 0; i--) {
            for (int j = i - 1; j >= 0; j--) {
                if (tmpArray[j] < tmpArray[i]) {
                    int tmp = tmpArray[i];
                    tmpArray[i] = tmpArray[j];
                    tmpArray[j] = tmp;
                }
            }
        }
        return tmpArray;
    }

  /*public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter the array size: ");
        int size = myScanner.nextInt();

        arrayGenerator arrayG = new arrayGenerator(size);
        int idx = 0;
        while(idx < size) {
            System.out.println("Enter a number into the array: ");
            arrayG.getInteger(idx, myScanner.nextInt());
            idx++;
        }

        arrayG.printArray();
        System.out.println();
        arrayG.printArray();
        System.out.println();
        arrayG.printArray();
        System.out.println();
        System.out.println(arrayG.findMin());
        System.out.println(arrayG.findMax());
    }*/
}
