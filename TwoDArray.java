public class TwoDArray {

    public static void main(String[] args) {

        int[][] x = { { 3, 2, 1 }, { 4, 5, 6 }, { 7, 8, 9 } };
        // 3 2 1
        // 4 5 6
        // 7 8 9

        for (int[] r : x) {
            for (int c : r) {
                System.out.println(c);
            }
        }

    }

}
