public class Course {

    private String name;

    // Default constructor - no return type and has the same name as the class
    public Course() {
        name = " ";
    }

    public Course(String name) {
        this.name = name; // this keyword - refers to the current object
    }

    // Getters and setters
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Other methods
    public void printName() {
        System.out.println("Course name: " + name);
    }
}
