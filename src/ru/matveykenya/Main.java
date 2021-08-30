package ru.matveykenya;

public class Main {

    private static final BinOps bins = new BinOps();

    public static void main(String[] args) {

        sum("1","1");
        sum("10","1");
        sum("11","11");

        mult("10","11");

    }

    private static void sum(String a, String b) {
        System.out.println("Суммируем числа " + a + " + " + b + " = " + bins.sum(a, b));
    }

    private static void mult(String a, String b) {
        System.out.println("Перемножаем числа " + a + " * " + b + " = " + bins.mult(a, b));
    }

}
