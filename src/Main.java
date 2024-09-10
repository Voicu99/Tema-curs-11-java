public class Main {

    // Single Inheritance Example: Bicycles
    static class Bicycle {
        protected int speed;
        protected int gear;

        public Bicycle(int speed, int gear) {
            this.speed = speed;
            this.gear = gear;
        }

        public void changeGear(int newGear) {
            this.gear = newGear;
            System.out.println("Gear changed to: " + newGear);
        }

        public void speedUp(int increment) {
            this.speed += increment;
            System.out.println("Speed increased to: " + speed);
        }

        public void applyBrake(int decrement) {
            this.speed -= decrement;
            System.out.println("Speed decreased to: " + speed);
        }
    }

    static class MountainBike extends Bicycle {
        private String tireType;
        private String suspension;

        public MountainBike(int speed, int gear, String tireType, String suspension) {
            super(speed, gear);
            this.tireType = tireType;
            this.suspension = suspension;
        }

        public void adjustSuspension(String newSuspension) {
            this.suspension = newSuspension;
            System.out.println("Suspension adjusted to: " + suspension);
        }
    }

    // Multilevel Inheritance Example: Cars
    static class Car {
        protected String make;
        protected String model;
        protected int year;

        public Car(String make, String model, int year) {
            this.make = make;
            this.model = model;
            this.year = year;
        }

        public void start() {
            System.out.println("Car started.");
        }

        public void stop() {
            System.out.println("Car stopped.");
        }

        public void accelerate() {
            System.out.println("Car is accelerating.");
        }
    }

    static class ElectricCar extends Car {
        protected int batteryCapacity;
        protected int range;

        public ElectricCar(String make, String model, int year, int batteryCapacity, int range) {
            super(make, model, year);
            this.batteryCapacity = batteryCapacity;
            this.range = range;
        }

        public void charge() {
            System.out.println("Charging the electric car.");
        }
    }

    static class Tesla extends ElectricCar {
        private String autopilotVersion;

        public Tesla(String make, String model, int year, int batteryCapacity, int range, String autopilotVersion) {
            super(make, model, year, batteryCapacity, range);
            this.autopilotVersion = autopilotVersion;
        }

        public void enableAutopilot() {
            System.out.println("Autopilot version " + autopilotVersion + " is enabled.");
        }
    }

    // Hierarchical Inheritance Example: Watercraft
    static class Boat {
        protected int length;
        protected int weight;

        public Boat(int length, int weight) {
            this.length = length;
            this.weight = weight;
        }

        public void sail() {
            System.out.println("Boat is sailing.");
        }
    }

    static class SpeedBoat extends Boat {
        private int maxSpeed;
        private String engineType;

        public SpeedBoat(int length, int weight, int maxSpeed, String engineType) {
            super(length, weight);
            this.maxSpeed = maxSpeed;
            this.engineType = engineType;
        }

        public void turboBoost() {
            System.out.println("Turbo boost activated! Max speed: " + maxSpeed + " km/h.");
        }
    }

    static class FishingBoat extends Boat {
        private int fishCapacity;
        private String typeOfNet;

        public FishingBoat(int length, int weight, int fishCapacity, String typeOfNet) {
            super(length, weight);
            this.fishCapacity = fishCapacity;
            this.typeOfNet = typeOfNet;
        }

        public void castNet() {
            System.out.println("Casting net with type: " + typeOfNet);
        }
    }

    public static void main(String[] args) {
        // Test Single Inheritance: Bicycle and MountainBike
        MountainBike mountainBike = new MountainBike(10, 3, "All-Terrain", "Soft");
        System.out.println("Testing Single Inheritance (Bicycle):");
        mountainBike.speedUp(5);
        mountainBike.changeGear(4);
        mountainBike.adjustSuspension("Hard");
        System.out.println();

        // Test Multilevel Inheritance: Car, ElectricCar, Tesla
        Tesla myTesla = new Tesla("Tesla", "Model S", 2022, 100, 400, "V3.0");
        System.out.println("Testing Multilevel Inheritance (Car):");
        myTesla.start();
        myTesla.enableAutopilot();
        myTesla.charge();
        System.out.println();

        // Test Hierarchical Inheritance: Boat, SpeedBoat, FishingBoat
        SpeedBoat speedBoat = new SpeedBoat(15, 3000, 120, "V8");
        System.out.println("Testing Hierarchical Inheritance (Boat - SpeedBoat):");
        speedBoat.sail();
        speedBoat.turboBoost();
        System.out.println();

        FishingBoat fishingBoat = new FishingBoat(20, 5000, 100, "Dragnet");
        System.out.println("Testing Hierarchical Inheritance (Boat - FishingBoat):");
        fishingBoat.sail();
        fishingBoat.castNet();
    }
}
