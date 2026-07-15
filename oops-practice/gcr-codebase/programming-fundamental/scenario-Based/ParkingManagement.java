class Vehicle {
    String vehicleNumber;
    String ownerName;
    String vehicleType;

    Vehicle(String vehicleNumber, String ownerName, String vehicleType) {
        this.vehicleNumber = vehicleNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    void display() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println();
    }

    static void displayCars(Vehicle[] vehicles) {
        System.out.println("Cars:");
        for (int i = 0; i < vehicles.length; i++) {
            if (vehicles[i].vehicleType.equalsIgnoreCase("Car")) {
                vehicles[i].display();
            }
        }
    }

    static void displayBikes(Vehicle[] vehicles) {
        System.out.println("Bikes:");
        for (int i = 0; i < vehicles.length; i++) {
            if (vehicles[i].vehicleType.equalsIgnoreCase("Bike")) {
                vehicles[i].display();
            }
        }
    }
}

public class ParkingManagement {
    public static void main(String[] args) {

        Vehicle[] vehicles = new Vehicle[10];

        vehicles[0] = new Vehicle("UP85A101", "Dev", "Car");
        vehicles[1] = new Vehicle("UP85A102", "Aman", "Bike");
        vehicles[2] = new Vehicle("UP85A103", "Riya", "Car");
        vehicles[3] = new Vehicle("UP85A104", "Karan", "Bike");
        vehicles[4] = new Vehicle("UP85A105", "Neha", "Car");
        vehicles[5] = new Vehicle("UP85A106", "Rahul", "Bike");
        vehicles[6] = new Vehicle("UP85A107", "Priya", "Car");
        vehicles[7] = new Vehicle("UP85A108", "Arjun", "Bike");
        vehicles[8] = new Vehicle("UP85A109", "Simran", "Car");
        vehicles[9] = new Vehicle("UP85A110", "Vikas", "Bike");

        Vehicle.displayCars(vehicles);

        Vehicle.displayBikes(vehicles);
    }
}