package view;

import calc.divm_p;

public class Print_divm {
    public static void P_divm(String[] args) {
        divm_p calc = new divm_p();

        System.out.println(calc.divpare(2, 3.2));
    }
}
