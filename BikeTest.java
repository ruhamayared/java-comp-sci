public class BikeTest {

    public static void main(String[] args) {

        MountainBike bike1 = new MountainBike(10, 2, 10);
        MountainBike bike2 = new MountainBike();

        Bicycle bike3 = new Bicycle(2, 10);

        System.out.println("Bike 1 speed: " + bike1.getSpeed());
        System.out.println("Bike 2 speed: " + bike2.getSpeed());

        bike1.speedUp(10);
        bike2.speedUp(10);
        bike3.speedUp(10);

        System.out.println("Bike 1 speed: " + bike1.getSpeed());
        System.out.println("Bike 2 speed: " + bike2.getSpeed());
        System.out.println("Bike 3 speed: " + bike3.getSpeed());
    }

}
