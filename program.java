import java.util.Scanner;

import controller.Controller;
import controller.Controller2;

public class program {
    public static void main(String[] args) {
        // Применить к калькулятору из ДЗ2 принципы SOLID
        // В конкретных классах выделены принципы, которые были применены в каждом конкретном случае. 
        System.out.println("Вариант 1");

        Controller controller = new Controller();
       
        double x = controller.setNumber1();
        double y = controller.setNumber2();

        System.out.println("Введите что будем делать ('+', '-', '*', '/')");
        Scanner scanner1 = new Scanner(System.in);
        String op = scanner1.nextLine();

        switch (op) {
            case "+":
                controller.summation(x, y);
                break;
            case "-":
                controller.subtraction(x, y);
                break;
            case "*":
                controller.multiplication(x, y);
                break;
            case "/":
                controller.division(x, y);
                break;
        }
       System.out.println("Вариант 2");
       
       Controller2 controller2 = new Controller2();
       
        double a = controller2.setNumber1();
        double b = controller2.setNumber2();

        System.out.println("Введите что будем делать ('+', '-', '*', '/')");
        Scanner scanner2 = new Scanner(System.in);
        String op2 = scanner1.nextLine();

        switch (op2) {
            case "+":
                controller2.summation(a, b);
                break;
            case "-":
                controller2.subtraction(a, b);
                break;
            case "*":
                controller2.multiplication(a, b);
                break;
            case "/":
                controller2.division(a, b);
                break;
        }

    }

}