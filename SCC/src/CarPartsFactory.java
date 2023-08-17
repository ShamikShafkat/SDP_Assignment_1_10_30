public interface CarPartsFactory {
    public Engine createEngine();
    public Tire createTire();
    public AC createAC();
    public Chesis createChesis();
}

class LowBudgetCarPartsFactory implements CarPartsFactory{

    @Override
    public Engine createEngine() {
        return new CC1300();
    }

    @Override
    public Tire createTire() {
        return new Snow();
    }

    @Override
    public AC createAC() {
        return new lowPoweredAC();
    }

    @Override
    public Chesis createChesis() {
        return new Tabular();
    }

}

class MediumLowBudgetCarPartsFactory implements CarPartsFactory{


    @Override
    public Engine createEngine() {
        return new CC1700();
    }

    @Override
    public Tire createTire() {
        return new Spare();
    }

    @Override
    public AC createAC() {
        return new lowPoweredAC();
    }

    @Override
    public Chesis createChesis() {
        return new Backbone();
    }

}

class MediumHighBudgetCarPartsFactory implements CarPartsFactory{



    @Override
    public Engine createEngine() {
        return new CC1800();
    }

    @Override
    public Tire createTire() {
        return new Whitewall();
    }

    @Override
    public AC createAC() {
        return new highPoweredAC();
    }

    @Override
    public Chesis createChesis() {
        return new LadderFrame();
    }

}

class HighBudgetCarPartsFactory implements CarPartsFactory{

    @Override
    public Engine createEngine() {
        return new CC2100();
    }

    @Override
    public Tire createTire() {
        return new Slick();
    }

    @Override
    public AC createAC() {
        return new highPoweredAC();
    }

    @Override
    public Chesis createChesis() {
        return new LadderFrame();
    }
}