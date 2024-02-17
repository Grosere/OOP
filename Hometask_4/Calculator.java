package Hometask_4;

import java.util.List;

public class Calculator {

    public Double sum(List<? extends Number> genList) {
        double result = 0;
        for (Number number : genList) {
            result += number.doubleValue();
        }
        return result;
    }

    public Double subs(List<? extends Number> genList) {
        double result = genList.get(0).doubleValue();
        for (Number number : genList) {
            result -= number.doubleValue();
        }
        return result;
    }

    public double multiplymass(List<? extends Number> genList) {
        double result = 1;
        for (Number number : genList) {
            result *= number.doubleValue();
        }
        return result;
    }

    public double multiplypare(Number num1, Number num2) {
        return num1.doubleValue() * num2.doubleValue();
    }

    public double divmass(List<? extends Number> genList) {
        double result = genList.get(0).doubleValue();
        for (int i = 1; i < genList.size(); i++) {
            result /= genList.get(i).doubleValue();
        }
        return result;
    }

    public double divpare(Number num1, Number num2) {
        return num1.doubleValue() / num2.doubleValue();
    }

    public StringBuilder binar(Object obj) {
        StringBuilder stringBuilder = new StringBuilder();
        if (obj instanceof Number) {
            stringBuilder.append(Integer.toBinaryString(((Number) obj).intValue()));
            if (obj instanceof Double) {
                stringBuilder.append('.');
                double denominator = ((Double) obj).doubleValue() % 1;
                for (int i = 0; i < 3; i++) {
                    denominator = denominator * 2 - (int) denominator * 2;
                    stringBuilder.append((int) denominator);
                }
            }
        }
        if (obj instanceof String) {
            for (int i = 0; i < ((String) obj).length(); i++) {
                stringBuilder.append(Integer.toBinaryString(((String) obj).charAt(i)));
            }
        }

        return stringBuilder;
    }
}