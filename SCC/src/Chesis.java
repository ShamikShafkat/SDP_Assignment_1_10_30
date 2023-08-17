public interface Chesis {
    public double cost();
    public String getName();
}

class Tabular implements Chesis{

    @Override
    public double cost() {
        return 5;
    }

    @Override
    public String getName() {
        return "Chesis : Tabular ,";
    }
}

class Backbone implements Chesis{

    @Override
    public double cost() {
        return 10;
    }

    @Override
    public String getName() {
        return "Chesis : Backbone";
    }
}

class LadderFrame implements Chesis{

    @Override
    public double cost() {
        return 15;
    }

    @Override
    public String getName() {
        return "Chesis : LadderFrame";
    }
}
