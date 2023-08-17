abstract public class SCC {

    public Car orderCar(CarType carType,BudgetType budgetType,CarColor carColor){
        Car car ;
        CarPartsFactory carPartsFactory  = assembleCarParts(budgetType);
        car = createCar(carType,carPartsFactory);
        car.prepareCar(carColor);
        return car ;
    }

    public abstract Car createCar(CarType carType,CarPartsFactory carPartsFactory);

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
