package Hometask_4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.sum(Arrays.asList(1, 3, 5, 6)));
        System.out.println(calc.sum(Arrays.asList(1.2, 3.5, 5, 6)));
        System.out.println(calc.subs(Arrays.asList(1, 3, 5, 6)));
        System.out.println(calc.subs(Arrays.asList(1.2, 3.5, 5, 6)));
        System.out.println(calc.multiplymass(Arrays.asList(1, 3, 5, 6)));
        System.out.println(calc.multiplypare(2, 3.2));
        System.out.println(calc.divmass(Arrays.asList(100, 2, 10)));
        System.out.println(calc.divpare(2, 3.2));
        System.out.println(calc.binar(156));
        System.out.println(calc.binar(156.231));
        System.out.println(calc.binar("Тестовая строка"));

    }
}