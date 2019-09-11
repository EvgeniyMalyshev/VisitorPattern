import parts.Body;
import parts.Engine;
import parts.Wheel;
import sevice.Service;

import java.util.Arrays;

@SuppressWarnings("WeakerAccess")
public class Car {
    private final Body body;
    private final Engine engine;
    private final Wheel[] wheels;

    public Car() {
        engine = new Engine();
        body = new Body();
        wheels = new Wheel[4];
        Arrays.fill(wheels, new Wheel());
    }

    public void doService(Service service) {
        body.accept(service);
        engine.accept(service);
        for (Wheel wheel : wheels) {
            wheel.accept(service);
        }
    }
}