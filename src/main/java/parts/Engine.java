package parts;

import sevice.Service;

public class Engine {
    public String getName() {
        return "engine";
    }

    public void accept(Service visitor) {
        visitor.visit(this);
    }
}
