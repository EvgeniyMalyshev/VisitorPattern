package sevice;

import parts.Body;
import parts.Engine;
import parts.Wheel;

public interface Service {
    void visit(Wheel element);

    void visit(Engine element);

    void visit(Body element);
}
