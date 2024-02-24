package calc;

import java.util.List;

public class divm {
    public double divmass(List<? extends Number> genList) {
        double result = genList.get(0).doubleValue();
        for (int i = 1; i < genList.size(); i++) {
            result /= genList.get(i).doubleValue();
        }
        return result;
    }
}
