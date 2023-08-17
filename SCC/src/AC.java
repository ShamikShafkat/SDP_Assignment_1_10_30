public interface AC {
    String getName();
    double cost();
}

class highPoweredAC implements AC{
    @Override
    public String getName() {
        return "AC : High Powered ,";
    }

    @Override
    public double cost() {
        return 10;
    }
}

class lowPoweredAC implements AC{
    @Override
    public String getName() {
        return "AC : Low Powered ,";
    }

    @Override
    public double cost() {
        return 5;
    }
}