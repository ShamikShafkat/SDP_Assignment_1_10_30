public interface AutomationFactory {
    public Automation createAutomation();
}

class AsiaAutomationFactory implements AutomationFactory{

    @Override
    public Automation createAutomation() {
        return new AsiaAutomation();
    }
}

class AmericaAutomationFactory implements AutomationFactory{

    @Override
    public Automation createAutomation() {
        return new AmericaAutomation();
    }
}
