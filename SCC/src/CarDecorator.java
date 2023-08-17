public abstract class CarDecorator extends Car {
    @Override
    public void prepareCar(CarColor carColor) {
        try {
            throw new Exception();
        } catch (Exception e) {
            System.out.println("Preparation of car must be before decoration");
        }
    }
}

