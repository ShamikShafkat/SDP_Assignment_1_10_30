class TightBumper extends CarDecorator{
    Car car;
    public TightBumper(Car car){
        this.car = car;
    }

    @Override
    public void prepareCar(CarColor carColor) {
        this.car.prepareCar(carColor);
    }

    @Override
    public double cost() {
        return 10 + this.car.cost();
    }

    @Override
    public String getDescription() {
        return this.car.getDescription() + "Added Decorator : TightBumper ,";
    }
}

class LooseBumper extends CarDecorator{
    Car car;
    public LooseBumper(Car car){
        this.car = car;
    }

    @Override
    public void prepareCar(CarColor carColor) {
        this.car.prepareCar(carColor);
    }

    @Override
    public double cost() {
        return 5 + this.car.cost();
    }

    @Override
    public String getDescription() {
        return this.car.getDescription() + "Added Decorator : LooseBumper ,";
    }
}