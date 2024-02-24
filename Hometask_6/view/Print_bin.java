package view;

import calc.stringbl;

public class Print_bin {
    public static void P_bin(String[] args) {
        stringbl calc = new stringbl();
        System.out.println(calc.binar(156));
        System.out.println(calc.binar(156.231));
        System.out.println(calc.binar("Тестовая строка"));
    }
}
