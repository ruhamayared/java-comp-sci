public class PositiveNegative {

    public static void main(String[] args) {
        int[] x = new int[6];
        x[0] = 1;
        x[1] = 2;
        x[2] = 3;
        x[3] = 4;
        x[4] = -1;
        x[5] = -2;

        int numNegatives = 0;

        for (int i = 0; i < x.length; i++) {
            if (x[i] < 0) {
                System.out.println(x[i]); // -1 -2
                numNegatives++;
            }
        }

        System.out.println(numNegatives); // 2
    }

}
