public class Bicycle {

    private int gear;
    private int speed;

    // Constructor
    public Bicycle() {
        gear = 0;
        speed = 0;
    }

    // Constructor with parameters
    public Bicycle(int startGear, int startSpeed) {
        this.gear = startGear;
        this.speed = startSpeed;
    }

    // What is the difference between using this.gear and gear?
    // this.gear refers to the gear variable of the class Bicycle
    // gear refers to the gear variable of the method
    // Which one should I use when?
    // this.gear should be used when you want to refer to the gear variable of the
    // class Bicycle
    // Do they do different things?
    // No, they do the same thing
    // Which one is better?
    // this.gear is better because it is more explicit
    // What is the difference between using this.gear and super.gear?
    // super.gear refers to the gear variable of the superclass

    // Getters
    public int getGear() {
        return gear;
    }

    public int getSpeed() {
        return speed;
    }

    // Setters
    public void setGear(int gear) {
        this.gear = gear;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    // Methods
    public void slowDown(int decrement) {
        speed -= decrement;
    }

    public void speedUp(int increment) {
        speed += increment;
    }

}
