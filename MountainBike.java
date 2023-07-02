public class MountainBike extends Bicycle {

    private int seatHeight;

    // Constructors
    public MountainBike() {
        super(); // Call the constructor of the superclass - we get the gear and speed variables
        seatHeight = 0;
    }

    public MountainBike(int startHeight, int startGear, int startSpeed) {
        super(startGear, startSpeed); // Call the constructor of the superclass - we get the gear and speed variables
        seatHeight = startHeight;
    }

    // Getters
    public int getSeatHeight() {
        return seatHeight;
    }

    // Setters
    public void setSeatHeight(int newValue) {
        seatHeight = newValue;
    }

    // Method
    public void setHeight(int newValue) {
        seatHeight = newValue;
    }

    // Method overriding
    public void slowDown(int decrement) {
        setSpeed(getSpeed() - (decrement / 2));
    }

    public void speedUp(int increment) {
        setSpeed(getSpeed() + (increment / 2));
    }
}

// How does Java know what the Bicycle class is?
// Java looks for the Bicycle class in the same directory as the MountainBike
// class
// What if the Bicycle class is in a different directory?
// You need to import the Bicycle class