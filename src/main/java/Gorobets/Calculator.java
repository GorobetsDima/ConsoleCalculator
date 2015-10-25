package Gorobets;

/**
 * @author Gorobets Dmitriy
 *         <p>
 *         At this Class in method "checkAnOperator" I put 3 arguments
 *         There is checked an operator and according to the operator chooses,
 *         which way to use for a calculation in the constructor
 *         <p>
 *         First argument is "firstArg"- it have to be a double type
 *         <p>
 *         Second argument is "operator"-it have to be an operator
 *         <p>
 *         Third argument is "secondArg"-it have to be a double type
 */

public class Calculator {

// сумма чисел
    public double add(double firstArg, double secondArg) {
        return firstArg + secondArg;
    }
// разность чисел
    public double deduct(double firstArg, double secondArg) {
        return firstArg - secondArg;
    }
// умножение чисел
    public double multiply(double firstArg, double secondArg) {
        return firstArg * secondArg;
    }
// разделение чисел
    public double divide(double firstArg, double secondArg) {
        return firstArg / secondArg;
    }
//проверка соответствия оператора и выбор операции для рассчета
    public void checkAnOperator(double firstArg, String operator, double secondArg) {
        if (operator.equals("+")) {
            System.out.println("Результат:" + firstArg + "+" + secondArg + "=" + add(firstArg, secondArg));
        } else if (operator.equals("-")) {
            System.out.println("Результат:" + firstArg + "-" + secondArg + "=" + deduct(firstArg, secondArg));
        } else if (operator.equals("x") | operator.equals("х")) {
            System.out.println("Результат:" + firstArg + "*" + secondArg + "=" + multiply(firstArg, secondArg));
        } else if (operator.equals("/")) {
            System.out.println("Результат:" + firstArg + "/" + secondArg + "=" + divide(firstArg, secondArg));
        } else {
            System.out.println("Оператор задан неправильно!");
        }
    }
}


