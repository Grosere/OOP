package calc;

import java.util.List;

public class multip {
    public double multiplymass(List<? extends Number> genList) {
        double result = 1;
        for (Number number : genList) {
            result *= number.doubleValue();
        }
        return result;
    }
}
