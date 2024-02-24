package view;

import java.util.Arrays;

import calc.sum;

public class Print_sum {
    public static void P_sum(String[] args) {
        sum calc = new sum();
        System.out.println(calc.summ(Arrays.asList(1, 3, 5, 6)));
        System.out.println(calc.summ(Arrays.asList(1.2, 3.5, 5, 6)));
    }
}
