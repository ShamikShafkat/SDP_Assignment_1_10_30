public interface Tire {
    public String getName();
    public double cost();
}

class Snow implements Tire{

    @Override
    public String getName() {
        return "Tire : Snow ,";
    }

    @Override
    public double cost() {
        return 1;
    }
}

class Spare implements Tire{

    @Override
    public String getName() {
        return "Tire : Spare ,";
    }

    @Override
    public double cost() {
        return 2;
    }
}

class Whitewall implements Tire{

    @Override
    public String getName() {
        return "Tire : Whitewall ,";
    }

    @Override
    public double cost() {
        return 3;
    }
}

class Slick implements Tire{
    @Override
    public String getName() {
        return "Tire : Slick";
    }

    @Override
    public double cost() {
        return 4;
    }
}