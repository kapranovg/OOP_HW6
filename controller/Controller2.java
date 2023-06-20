package controller;

// Применены следующие принципы SOLID:
// 3) Liskov substitution principle:
// Создан дополнительный класс Controller2 с родительским классом Controller. 
// При этом функционал дочернего класса расширен, а на program.java проведена проверка, 
// что все арифметические операции выполняются и для Controller2.
// То есть Controller2 может полностью заменить Controller.


public class Controller2 extends Controller{
    public void Minimum(Number number1, Number number2) {
        System.out.println(" Minimum of " + number1  + " and " + number2 + " = " + (Math.min((double)(number1), (double)(number2))));
    }
}