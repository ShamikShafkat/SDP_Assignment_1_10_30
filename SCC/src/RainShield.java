class ThickRainShield extends CarDecorator{
    Car car;
    public ThickRainShield(Car car){
        this.car = car;
    }

    @Override
    public double cost() {
        return 2 + this.car.cost();
    }

    @Override
    public String getDescription() {
        return this.car.getDescription() + "Added Decorator : ThickRainShield ,";
    }
}

class ThinRainShield extends CarDecorator{
    Car car;
    public ThinRainShield(Car car){
        this.car = car;
    }

    @Override
    public double cost() {
        return 5 + this.car.cost();
    }

    @Override
    public String getDescription() {
        return this.car.getDescription() + "Added Decorator : ThinRainShield ,";
    }
}

class CurvedRainShield extends CarDecorator{
    Car car;
    public CurvedRainShield(Car car){
        this.car = car;
    }

    @Override
    public double cost() {
        return 10 + this.car.cost();
    }

    @Override
    public String getDescription() {
        return this.car.getDescription() + "Added Decorator : CurvedRainShield ,";
    }
}