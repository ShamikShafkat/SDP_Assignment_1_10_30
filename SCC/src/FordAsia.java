public class FordAsia extends SCC{

    @Override
    public Car createCar(CarType carType,CarPartsFactory carPartsFactory) {
        if(carType == CarType.RACING){
            return new RacingCar(carPartsFactory,new FordsCompanyFactory(),new AsiaAutomationFactory());
        }
        else if(carType == CarType.PRIVATE){
            return new PrivateCar(carPartsFactory,new FordsCompanyFactory(), new AsiaAutomationFactory());
        }
        else if(carType == CarType.SUV){
            return new SUVCar(carPartsFactory,new FordsCompanyFactory(), new AsiaAutomationFactory());
        }
        else if(carType == CarType.MILITARY){
            return new MilitaryCar(carPartsFactory,new FordsCompanyFactory(),new AsiaAutomationFactory());
        }
        else{
            return null;
        }
    }

}
