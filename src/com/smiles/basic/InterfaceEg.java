package com.smiles.basic;

public class InterfaceEg {

    public static void main(String args[]) {
        TaxCalculator calculator = getCalculator();
        System.out.println(calculator.calculateTax());
    }

    private static TaxCalculator getCalculator() {
        return new TaxCalculator2019();
    }

    interface TaxCalculator {
        float calculateTax();
    }

    static class TaxCalculator2019 implements TaxCalculator {

        @Override
        public float calculateTax() {
            return 5;
        }
    }

    static class TaxCalculator2020 implements TaxCalculator {

        @Override
        public float calculateTax() {
            return 10;
        }
    }
}
