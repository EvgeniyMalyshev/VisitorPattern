package sevice;

import parts.Body;
import parts.Engine;
import parts.Wheel;

public class CheckService implements Service {

    public void visit(Wheel element) {
        System.out.println("Checking: " + element.getName());
    }


    public void visit(Engine element) {
        System.out.println("Checking: " + element.getName());
    }


    public void visit(Body element) {
        System.out.println("Checking: " + element.getName());
    }
}