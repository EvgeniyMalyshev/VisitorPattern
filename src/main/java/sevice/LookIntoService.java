package sevice;

import parts.Body;
import parts.Cornflake;
import parts.Engine;
import parts.Wheel;

public class LookIntoService implements Service {
    public void visit(Wheel element) {

    }

    public void visit(Engine element) {

    }

    public void visit(Body element) {

    }

    public void visit(Cornflake element) {
        System.out.println("Look, here is a " + element.getName());
    }
}
