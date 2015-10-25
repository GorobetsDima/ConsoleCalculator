package Gorobets;

/**
 * @author Gorobets Dmitriy
 *         <p>
 *         In class Main I create a instance of Calculator.class
 *         Before that I check whether a number is a double type or not
 *         And figure out how many arguments was entered
 *         which way to use for a calculation in the constructor
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Здравствуй мой друг!");
        System.out.println("Что бы я посчитал все верно, используй пожалуйста пробелы между аргументами: 15.4 + -7 или -8 х 3!");
        System.out.println("Я поддержываю такие операции: + , - , / , х !");
        System.out.println("Что ты хочешь сосчитать? :)");
        System.out.println("");
        if (args.length == 3) {
            try {
                if (Double.valueOf(args[0]) instanceof Double & Double.valueOf(args[2]) instanceof Double) {

                    Calculator calc = new Calculator();
                    calc.checkAnOperator(Double.valueOf(args[0]), args[1], Double.valueOf(args[2]));

                }
            } catch (Exception e) {
                System.out.println("Вы ввели не правильное число!");
            }
        } else {
            System.out.println("Выражение введено неправельно!Пример: 5 + 5");
        }

    }
}