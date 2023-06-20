package model;

import java.util.Scanner;

// Применены следующие принципы SOLID:
// 1) Single responsibility principle:
// Ранее сразу в этом классе были реализованы все методы по вычислению.
// Сейчас в классе оставлена только сущность по формированию 2 чисел, с которыми дальше будет производиться работа. 
// 2) Open-closed principle:
// Введены новые методы setNumber1 и setNumber2 в дополнение к предыдущим методам, но уже без аргументов, а с запросом из консоли. 
// Функционал расширен за счет новых методов без изменения старых.


public class Numbers {
    public double number1;
    public double number2;

    public Numbers(double number1, double number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public double getNumber1() {
        return number1;
    }

    public static double setNumber1() {
        System.out.println("Введите первое число:");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    public static double setNumber2() {
        System.out.println("Введите второе число:");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    public void setNumber1(double number1) {
        this.number1 = number1;
    }

    public double getNumber2() {
        return number2;
    }

    public void setNumber2(double number2) {
        this.number2 = number2;
    }

}