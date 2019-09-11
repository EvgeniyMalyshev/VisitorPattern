package parts;

import sevice.Service;

public class Wheel {
    public String getName() {
        return "wheel";
    }

    public void accept(Service visitor) {
        visitor.visit(this);
    }
}
