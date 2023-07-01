import java.util.ArrayList;

public class ArrayListTest {

    public static void main(String[] args) {
        ArrayList<Integer> x = new ArrayList<Integer>();

        x.add(1);
        x.add(2);
        x.add(3);

        System.out.println(x.get(0)); // 1
        System.out.println(x.size()); // 3
        System.out.println(x.contains(2)); // true
        System.out.println(x.indexOf(2)); // 1
        System.out.println(x.remove(1)); // removes 2 and returns it
        System.out.println(x.size()); // 2
        System.out.println(x.add(4)); // returns true if it was added - to end of list
        x.add(0, 1); // add 1 to index 0
        System.out.println(x.get(0)); // 1
        System.out.println(x.size()); // 1
        x.set(0, 6); // replaces 1 with 6
        System.out.println(x.get(0)); // 6

        System.out.println(x); // [6, 3, 4]
    }

}
