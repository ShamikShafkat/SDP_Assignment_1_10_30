public class OpenRoofSystem  extends CarDecorator{
    Car car;
    public OpenRoofSystem(Car car){
        this.car = car;
    }


    @Override
    public double cost() {
        return 20 + this.car.cost();
    }

    @Override
    public String getDescription() {
        return this.car.getDescription() + "Added Decorator : OpenRoofSystem ,";
    }
}
