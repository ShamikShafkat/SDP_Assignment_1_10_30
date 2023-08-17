public class Demo {

    public static void main(String[] args){
        SCC scc = new FordAsia();
        Car car = scc.orderCar(CarType.RACING,BudgetType.LOW,CarColor.BLACK);
        System.out.println("Total cost of the car is : " + car.cost());
        System.out.println(car.getDescription());

        car = new ThickRainShield(car);
        System.out.println("Total cost of the car is : " + car.cost());
        System.out.println(car.getDescription());

        car = new TightBumper(car);
        System.out.println("Total cost of the car is : " + car.cost());
        System.out.println(car.getDescription());

        car = new MobileBasedControlSystem(car);
        System.out.println("Total cost of the car is : " + car.cost());
        System.out.println(car.getDescription());

        car = new OpenRoofSystem(car);
        System.out.println("Total cost of the car is : " + car.cost());
        System.out.println(car.getDescription());
    }
}
