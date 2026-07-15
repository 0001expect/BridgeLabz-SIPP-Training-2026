package polymorphism;

public class MainTransport {
    public static void main(String[] args) {

        Car car = new Car("jj");
        Bus bus = new Bus("local");
        Bike bike = new Bike("honda");

        Vehicle[] vehicles = {car, bus, bike};

        for(Vehicle ele : vehicles){
            System.out.println(ele.name+ ": "+ ele.costFuel(1));
        }
    }
}