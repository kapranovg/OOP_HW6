package service;

// Применены следующие принципы SOLID:

// 4) Interface segregation principle:
// Выделены отдельные интерфейсы для вычисления простых арифметических действий и более сложных в DifficultActions.

public interface SimpleActions {

    public void summation(Number number1, Number number2);

    public void subtraction(Number number1, Number number2);

    public void multiplication(Number number1, Number number2);

    public void division(Number number1, Number number2);

}