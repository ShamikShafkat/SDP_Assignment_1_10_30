public class ToyotaAmerica extends SCC{

    @Override
    public Car createCar(CarType carType,CarPartsFactory carPartsFactory) {
        if(carType == CarType.RACING){
            return new RacingCar(carPartsFactory,new ToyotaCompanyFactory(),new AmericaAutomationFactory());
        }
        else if(carType == CarType.PRIVATE){
            return new PrivateCar(carPartsFactory,new ToyotaCompanyFactory(), new AmericaAutomationFactory());
        }
        else if(carType == CarType.SUV){
            return new SUVCar(carPartsFactory,new ToyotaCompanyFactory(), new AmericaAutomationFactory());
        }
        else if(carType == CarType.MILITARY){
            return new MilitaryCar(carPartsFactory,new ToyotaCompanyFactory(),new AmericaAutomationFactory());
        }
        else{
            return null;
        }
    }

}
