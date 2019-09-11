package parts;

import sevice.Service;

public class Cornflake  {
    public String getName(){
        return "cornflake";
    }

    public void accept(Service visitor){
        visitor.visit(this);
    }
}
