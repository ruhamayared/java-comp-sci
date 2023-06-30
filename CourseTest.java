public class CourseTest {

    public static void main(String[] args) {

        Course algbera2 = new Course("Math"); // Creating an instance of the Course class

        Course geometry = new Course(algbera2.getName()); // Creating an instance of the Course class

        // algbera2.printName(); // Calling the printName method on the algebra2 object

        // algbera2.setName("Algebra 2"); // Calling the setName method on the algebra2
        // object and passing it the string
        // // "Algebra 2" as an argument

        geometry.printName(); // Calling the printName method on the algebra2 object

    }

}
