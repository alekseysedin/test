import java.util.function.*;

public class Calculator {
    static Supplier<Calculator> instance = Calculator::new;
    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply= (x, y) -> x * y;
    BinaryOperator<Integer> devide = (x, y) -> {
        return (y == 0) ? 0 : x / y;
    };
    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> { return x > 0 ? x : x * -1;} ; //т.к тело метода состоит из нескольких операторов
                                                                      // то его необходимо заключить в {} и указать
                                                                      // ключевое слово return
    Predicate<Integer> isPositive = x -> x > 0;
    Consumer<Object> println = System.out::println;                   //Поменял тип переменной на Object, так как
                                                                      //в противном случаи не выполняется операция
                                                                      // isPositive, результатом которой является тип boolean
}
