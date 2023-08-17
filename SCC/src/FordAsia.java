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

    @Override
    public CarPartsFactory assembleCarParts(BudgetType budgetType) {
        if(budgetType == BudgetType.LOW){
            return new LowBudgetCarPartsFactory();
        }
        else if(budgetType == BudgetType.MEDIUM_LOW){
            return new MediumLowBudgetCarPartsFactory();
        }
        else if(budgetType == BudgetType.MEDIUM_HIGH){
            return new MediumHighBudgetCarPartsFactory();
        }
        else if(budgetType == BudgetType.HIGH){
            return new HighBudgetCarPartsFactory();
        }
        else {
            return null;
        }
    }


}
