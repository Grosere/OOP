package calc;

import java.util.List;

public class subs {
    public Double sub(List<? extends Number> genList) {
        double result = genList.get(0).doubleValue();
        for (Number number : genList) {
            result -= number.doubleValue();
        }
        return result;
    }
}
