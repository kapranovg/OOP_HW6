package service;

public class DifficultActionsImpl implements DifficultActions{

    @Override
    public void XtoTheYpower(Number number1, Number number2) {
        System.out.println(number1 + " in the power of " + number2 + " = " + Math.pow((double)(number1), (double)(number2)));
    }

    @Override
    public void XlogY(Number number1, Number number2) {
        System.out.println(number1 + " in the power of " + number2 + " = " + (Math.log((double)(number1)) / Math.log((double)(number2))));
    }
    
}