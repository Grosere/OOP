package calc;

import java.util.List;

public class sum {
    public Double summ(List<? extends Number> genList) {
        double result = 0;
        for (Number number : genList) {
            result += number.doubleValue();
        }
        return result;
    }
}
