package ru.pda;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1,1);
        int c = calc.devide.apply(a, b); // ошибка деления на 0 (a = 3, b = 0, c = 3/0 ошибка)

        calc.println.accept(c);
    }
}
