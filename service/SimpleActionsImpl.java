package service;

public class SimpleActionsImpl implements SimpleActions {
    @Override
    public void summation(Number number1, Number number2) {
        System.out.println(number1 + " + " + number2 + " = " + ((double)(number1) + (double)(number2)));
    }

    @Override
    public void subtraction(Number number1, Number number2) {
        System.out.println(number1 + " - " + number2 + " = " + ((double)(number1) - (double)(number2)));
    }

    @Override
    public void multiplication(Number number1, Number number2) {

        System.out.println(number1 + " * " + number2 + " = " + ((double)(number1) * (double)(number2)));
    }

    @Override
    public void division(Number number1, Number number2) {
        System.out.println(number1 + " / " + number2 + " = " + ((double)(number1) / (double)(number2)));
    }
}