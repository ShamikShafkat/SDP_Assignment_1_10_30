public class BMWAsia extends SCC{

    @Override
    public Car createCar(CarType carType,CarPartsFactory carPartsFactory) {
        if(carType == CarType.RACING){
            return new RacingCar(carPartsFactory,new BMWCompanyFactory(),new AsiaAutomationFactory());
        }
        else if(carType == CarType.PRIVATE){
            return new PrivateCar(carPartsFactory,new BMWCompanyFactory(), new AsiaAutomationFactory());
        }
        else if(carType == CarType.SUV){
            return new SUVCar(carPartsFactory,new BMWCompanyFactory(), new AsiaAutomationFactory());
        }
        else if(carType == CarType.MILITARY){
            return new MilitaryCar(carPartsFactory,new BMWCompanyFactory(),new AsiaAutomationFactory());
        }
        else{
            return null;
        }
    }

}

