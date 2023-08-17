public interface BodyDesign {
    public String getName();
    public double cost();
}

class Fords implements BodyDesign{

    @Override
    public String getName() {
        return "Company : Fords ";
    }

    @Override
    public double cost() {
        return 10;
    }
}

class Ferrari implements BodyDesign{

    @Override
    public String getName() {
        return "Company : Ferrari";
    }

    @Override
    public double cost() {
        return 30;
    }
}
class Toyota implements BodyDesign{

    @Override
    public String getName() {
        return "Company : Toyota";
    }

    @Override
    public double cost() {
        return 20;
    }
}
class BMW implements BodyDesign{

    @Override
    public String getName() {
        return "Company : BMW";
    }

    @Override
    public double cost() {
        return 50;
    }
}

class Chevrolet implements BodyDesign{

    @Override
    public String getName() {
        return "Company : Chevrolet";
    }

    @Override
    public double cost() {
        return 40;
    }
}