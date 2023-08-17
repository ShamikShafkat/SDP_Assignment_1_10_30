public interface Automation {
    public String getName();
    public double cost();
}

class AsiaAutomation implements Automation{

    @Override
    public String getName() {
        return "Automation : Asia ,";
    }

    @Override
    public double cost() {
        return 10;
    }
}

class AmericaAutomation implements Automation{

    @Override
    public String getName() {
        return "Automation : America ,";
    }

    @Override
    public double cost() {
        return 5;
    }
}
