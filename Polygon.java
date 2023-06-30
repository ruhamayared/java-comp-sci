public class Polygon {

    private String name;
    private int numSides;

    // Default constructor
    public Polygon() {
        name = " ";
        numSides = 0;
    }

    // Constructor with parameters
    public Polygon(String name, int numSides) {
        this.name = name;
        this.numSides = numSides;
    }

    // Override the toString method
    public String toString() {
        return "Polygon name: " + name + "\nNumber of sides: " + numSides;
    }

    // Getters and setters
    public void setNameSides(String name, int numSides) {
        this.name = name;
        this.numSides = numSides;
    }

    public String getName() {
        return name;
    }

    public int getNumSides() {
        return numSides;
    }

    // Other methods
    public void printNameSides() {
        System.out.println("Polygon name: " + name + "\nNumber of sides: " + numSides);
    }
}
