package calc;

public class stringbl {
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
