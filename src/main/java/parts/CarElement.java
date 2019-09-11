package parts;

import sevice.Service;

public interface CarElement {
    String getName();

    void accept(Service visitor);
}