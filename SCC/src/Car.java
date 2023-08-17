public abstract class Car {
    Engine engine;
    Tire tire;
    AC ac;
    Chesis chesis;
    CarColor carColor;
    Seat seat;
    BodyDesign bodyDesign;
    Automation automation;

    public abstract void prepareCar(CarColor carColor);

    public abstract double cost();

    public abstract String getDescription();

}

class RacingCar extends Car{

    CarPartsFactory carPartsFactory;
    CompanyFactory companyFactory;
    AutomationFactory automationFactory;

    public RacingCar(CarPartsFactory carPartsFactory,CompanyFactory companyFactory,AutomationFactory automationFactory) {
        this.carPartsFactory = carPartsFactory;
        this.companyFactory = companyFactory;
        this.automationFactory = automationFactory;
    }

    @Override
    public void prepareCar(CarColor carColor) {
        this.engine = this.carPartsFactory.createEngine();
        this.tire = this.carPartsFactory.createTire();
        this.ac = this.carPartsFactory.createAC();
        this.chesis = this.carPartsFactory.createChesis();
        this.bodyDesign = this.companyFactory.createBodyDesign();
        this.automation = this.automationFactory.createAutomation();
        this.seat =  new RacingCarSeat();
        this.carColor = carColor;
    }

    @Override
    public double cost() {
        return this.engine.cost() + this.tire.cost() + this.chesis.cost() +
                this.automation.cost() + this.bodyDesign.cost() + this.ac.cost() + 100;
    }

    @Override
    public String getDescription() {
        return "Racing Car with " + this.engine.getName() + this.tire.getName() + this.chesis.getName()
                + this.ac.getName() + this.bodyDesign.getName() + this.automation.getName() +
                 this.seat.getName() ;
    }
}

class PrivateCar extends Car{

    CarPartsFactory carPartsFactory;
    CompanyFactory companyFactory;
    AutomationFactory automationFactory;

    public PrivateCar(CarPartsFactory carPartsFactory,CompanyFactory companyFactory,AutomationFactory automationFactory) {
        this.carPartsFactory = carPartsFactory;
        this.companyFactory = companyFactory;
        this.automationFactory = automationFactory;
    }

    @Override
    public void prepareCar(CarColor carColor) {
        engine = this.carPartsFactory.createEngine();
        tire = this.carPartsFactory.createTire();
        ac = this.carPartsFactory.createAC();
        chesis = this.carPartsFactory.createChesis();
        bodyDesign = this.companyFactory.createBodyDesign();
        automation = this.automationFactory.createAutomation();
        seat =  new PrivateCarSeat();
        this.carColor = carColor;
    }

    @Override
    public double cost() {
        return this.engine.cost() + this.tire.cost() + this.chesis.cost() +
                this.automation.cost() + this.bodyDesign.cost() + this.ac.cost() + 50;
    }

    @Override
    public String getDescription() {
        return "Private Car with " + this.engine.getName() + this.tire.getName() + this.chesis.getName()
                + this.ac.getName() + this.bodyDesign.getName() + this.automation.getName() +
                this.seat.getName() ;
    }
}

class SUVCar extends Car{

    CarPartsFactory carPartsFactory;
    CompanyFactory companyFactory;
    AutomationFactory automationFactory;

    public SUVCar(CarPartsFactory carPartsFactory,CompanyFactory companyFactory,AutomationFactory automationFactory) {
        this.carPartsFactory = carPartsFactory;
        this.companyFactory = companyFactory;
        this.automationFactory = automationFactory;
    }

    @Override
    public void prepareCar(CarColor carColor) {
        engine = this.carPartsFactory.createEngine();
        tire = this.carPartsFactory.createTire();
        ac = this.carPartsFactory.createAC();
        chesis = this.carPartsFactory.createChesis();
        bodyDesign = this.companyFactory.createBodyDesign();
        automation = this.automationFactory.createAutomation();
        seat =  new SUVCarSeat();
        this.carColor = carColor;
    }

    @Override
    public double cost() {
        return this.engine.cost() + this.tire.cost() + this.chesis.cost() +
                this.automation.cost() + this.bodyDesign.cost() + this.ac.cost() + 150;
    }

    @Override
    public String getDescription() {
        return "SUV Car with " + this.engine.getName() + this.tire.getName() + this.chesis.getName()
                + this.ac.getName() + this.bodyDesign.getName() + this.automation.getName() +
                this.seat.getName() ;
    }
}

class MilitaryCar extends Car{

    CarPartsFactory carPartsFactory;
    CompanyFactory companyFactory;
    AutomationFactory automationFactory;

    public MilitaryCar(CarPartsFactory carPartsFactory,CompanyFactory companyFactory,AutomationFactory automationFactory) {
        this.carPartsFactory = carPartsFactory;
        this.companyFactory = companyFactory;
        this.automationFactory = automationFactory;
    }

    @Override
    public void prepareCar(CarColor carColor) {
        engine = this.carPartsFactory.createEngine();
        tire = this.carPartsFactory.createTire();
        ac = this.carPartsFactory.createAC();
        chesis = this.carPartsFactory.createChesis();
        bodyDesign = this.companyFactory.createBodyDesign();
        automation = this.automationFactory.createAutomation();
        seat =  new MilitaryCarSeat();
        this.carColor = carColor;
    }

    @Override
    public double cost() {
        return this.engine.cost() + this.tire.cost() + this.chesis.cost() +
                this.automation.cost() + this.bodyDesign.cost() + this.ac.cost() + 200;
    }

    @Override
    public String getDescription() {
        return "Military Car with " + this.engine.getName() + this.tire.getName() + this.chesis.getName()
                + this.ac.getName() + this.bodyDesign.getName() + this.automation.getName() +
                this.seat.getName() ;
    }
}
