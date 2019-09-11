import sevice.CheckService;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.doService(new CheckService());
    }
}
