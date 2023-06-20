package controller;

// Применены следующие принципы SOLID:
// 5) Dependency inversion principle:
// Модуль Controller не зависит от более низкого модуля Controller2, в котором был расширен функционал.

import service.SimpleActionsImpl;
import model.Numbers;

public class Controller {
    SimpleActionsImpl simpleActions;

    public Controller() {
        this.simpleActions = new SimpleActionsImpl();
    }

    public double setNumber1() {
        return Numbers.setNumber1();
    }

    public double setNumber2() {
        return Numbers.setNumber2();
    }

    public void summation(Number number1, Number number2) {
        simpleActions.summation(number1, number2);
    }
    public void subtraction(Number number1, Number number2) {
        simpleActions.subtraction(number1, number2);
    }
    public void multiplication(Number number1, Number number2) {
        simpleActions.multiplication(number1, number2);
    }
    public void division(Number number1, Number number2) {
        simpleActions.division(number1, number2);
    }

}