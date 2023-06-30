public class StringTest {

    public static void main(String[] args) {
        String s1 = "Happy";
        System.out.println(s1);

        String s2 = s1 + "Birthday!";
        System.out.println(s1);

        System.out.println(s1.length());
        System.out.println(s1.charAt(0));
        System.out.println(s1.substring(4));
        System.out.println(s1.substring(2, 3));
        System.out.println(s2.indexOf('B'));
        System.out.println(s1.compareTo(s2));

    }
}
