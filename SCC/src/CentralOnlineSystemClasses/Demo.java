package CentralOnlineSystemClasses;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Demo for point 5. Here same date book for car washing would be rejected : ");

        Thread thread1 = new Thread(new DemoThread());
        Thread thread2 = new Thread(new DemoThread());
        thread1.start();
        thread2.start();

    }
}
