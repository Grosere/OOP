package view;

import java.util.Arrays;

import calc.multip;
import calc.multip_p;

public class Print_multy {
    public static void P_multy(String[] args) {
        multip calc = new multip();
        multip_p calc2 = new multip_p();

        System.out.println(calc.multiplymass(Arrays.asList(1, 3, 5, 6)));
        System.out.println(calc2.multiplypare(2, 3.2));
    }
}
