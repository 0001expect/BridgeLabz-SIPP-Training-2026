package polymorphism;

class Bus extends Vehicle{
    Bus(String name){
        super(name);
    }
    public int costFuel(int km){
        return 20*km;
    }
}