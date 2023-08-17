public interface Engine {
    public String getName();
    public double cost();
}

class CC1300 implements Engine{

    @Override
    public String getName() {
        return "Engine : 1300CC ,";
    }

    @Override
    public double cost() {
        return 10;
    }
}

class CC1700 implements Engine{

    @Override
    public String getName() {
        return "Engine : 1700CC ,";
    }

    @Override
    public double cost() {
        return 20;
    }
}

class CC1800 implements Engine{

    @Override
    public String getName() {
        return "Engine : 1800CC ,";
    }

    @Override
    public double cost() {
        return 30;
    }
}

class CC2100 implements Engine{

    @Override
    public String getName() {
        return "Engine : 2100CC ,";
    }

    @Override
    public double cost() {
        return 40;
    }
}
