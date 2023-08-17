class MobileBasedControlSystem extends CarDecorator {
    Car car;
    public MobileBasedControlSystem(Car car){
        this.car = car;
    }


    @Override
    public double cost() {
        return 20 + this.car.cost();
    }

    @Override
    public String getDescription() {
        return this.car.getDescription() + "Added Decorator : MobileBasedGateControllingSystem ,";
    }
}

class RemoteBasedControlSystem extends CarDecorator {
    Car car;
    public RemoteBasedControlSystem(Car car){
        this.car = car;
    }

    @Override
    public double cost() {
        return 10 + this.car.cost();
    }

    @Override
    public String getDescription() {
        return this.car.getDescription() + "Added Decorator : RemoteBasedGateControllingSystem ,";
    }
}
