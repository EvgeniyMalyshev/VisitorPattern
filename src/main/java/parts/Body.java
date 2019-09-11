package parts;

import sevice.Service;

public class Body implements CarElement{

    public String getName() {
        return "body";
    }

    public void accept(Service visitor) {
        visitor.visit(this);
    }
}
