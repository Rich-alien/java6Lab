package t2;

import javax.ejb.Stateful;

@Stateful
public class OperationsSessionBeanStateful {

    public Float num = null;

    public String name = null;

    public float add (float x, float y) {
        return x + y;
    }

    public float subtract (float x, float y) {
        return x - y;
    }

    public float multiply (float x, float y) {
        return x * y;
    }

    public float divide (float x, float y) {
        return x / y;
    }

}
