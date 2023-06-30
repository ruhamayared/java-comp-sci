public class PolygonTest {

    public static void main(String[] args) {
        Polygon triangle = new Polygon("Triangle", 3);
        Polygon square = new Polygon("Square", 4);
        triangle = square;

        System.out.println(triangle);
        System.out.println(square);
        System.out.println(triangle.equals(square));
    }

}
