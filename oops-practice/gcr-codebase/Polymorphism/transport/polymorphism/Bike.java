package polymorphism;

class Bike extends Vehicle {
    Bike(String name){
        super (name);
    }
    public int costFuel(int km){
        return 30*km;
    }
}
