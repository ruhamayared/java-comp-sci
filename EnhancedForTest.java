public class EnhancedForTest {

    public static void main(String[] args) {
        int[] x = { 1, 2, 3, 4, 5 };
        int sum = 0;

        // for Each loop - enhanced for loop - usually used for arrays to iterate
        // through them
        for (int i : x) {
            sum += i;
        }

        System.out.println(sum);

        // for loop - used for arrays to iterate through them
        for (int i = 0; i < x.length; i++) {
            sum += x[i];

            System.out.println(sum);
        }
    }

    // The difference between the two is that the enhanced for loop is used for
    // arrays/collections and the for loop is used for arrays and other things. The
    // enhanced for
    // loop is also easier to read and write. The for loop is more flexible and can
    // be used for more things. The enhanced for loop is also more efficient. The
    // for loop is more efficient when you need to remove or change elements of an
    // array.

}
