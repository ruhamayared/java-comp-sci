import java.lang.reflect.Array;

public class ArrayTest {
    public static void main(String[] args) {
        int[] x = new int[6];
        x[0] = 1;
        x[1] = 2;

        printArray(x);
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < Array.getLength(array); i++) {
            System.out.println(array[i]);
        }
    }
}
