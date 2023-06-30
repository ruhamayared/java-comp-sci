public class RandomTest {
    public static void main(String[] args) {
        int x = (int) (Math.random() * 6) + 1; // the +1 is to make sure the range is 1-6 - otherwise it would be 0-5
        System.out.println(x);
    }

}
