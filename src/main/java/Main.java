import sevice.CheckService;
import sevice.LookIntoService;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.doService(new CheckService());
        car.lookInto(new LookIntoService());
    }
}
