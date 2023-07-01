import java.lang.reflect.Array; // for getLength()
import java.util.Arrays; // for toString()

public class ArrayTest {
    public static void main(String[] args) {
        int[] x = new int[6];
        x[0] = 1;
        x[1] = 2;
        x[2] = 3;
        x[3] = 4;

        printArray(x); // 1 2 3 4 0 0
        System.out.println(Arrays.toString(x)); // [1, 2, 3, 4, 0, 0]
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < Array.getLength(array); i++) {
            System.out.println(array[i]);
        }
    }

}
