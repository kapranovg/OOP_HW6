package service;
// Применены следующие принципы SOLID:

// 4) Interface segregation principle:
// Выделены отдельные интерфейсы для вычисления сложных арифметических действий. 
// Интерфейс выделен, но дальше в контроллер не встраивался за ненадобностью. 

public interface DifficultActions {
    public void XtoTheYpower(Number number1, Number number2);

    public void XlogY(Number number1, Number number2);
}