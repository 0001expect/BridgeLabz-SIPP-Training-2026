package polymorphism;

class Car extends Vehicle {
    Car(String name){
        super(name);
    }

    public int costFuel(int km){
        return 10*km;
    }
}