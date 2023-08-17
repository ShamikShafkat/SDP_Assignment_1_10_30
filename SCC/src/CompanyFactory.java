public interface CompanyFactory {
    public BodyDesign createBodyDesign();
}

class FordsCompanyFactory implements CompanyFactory{
    @Override
    public BodyDesign createBodyDesign() {
        return new Fords();
    }
}

class FerrariCompanyFactory implements CompanyFactory{
    @Override
    public BodyDesign createBodyDesign() {
        return new Ferrari();
    }
}

class ToyotaCompanyFactory implements CompanyFactory{

    @Override
    public BodyDesign createBodyDesign() {
        return new Toyota();
    }
}

class BMWCompanyFactory implements CompanyFactory{
    @Override
    public BodyDesign createBodyDesign() {
        return new BMW();
    }
}

class ChevroletCompanyFactory implements CompanyFactory{
    @Override
    public BodyDesign createBodyDesign() {
        return new Chevrolet();
    }
}