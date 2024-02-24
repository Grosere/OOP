package view;

import java.util.Arrays;

import calc.subs;

public class Print_subs {
    public static void P_sub(String[] args) {
        subs calc = new subs();
        System.out.println(calc.sub(Arrays.asList(1, 3, 5, 6)));
        System.out.println(calc.sub(Arrays.asList(1.2, 3.5, 5, 6)));
    }
}
