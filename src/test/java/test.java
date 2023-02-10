import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class test {

    @org.junit.jupiter.api.Test
    public void testPlus() {
        Calculator calc = Calculator.instance.get();
        int expected = 3;
        int result = calc.plus.apply(1, 2);

        assertEquals(expected, result);
    }
    @org.junit.jupiter.api.Test
    public void testTrue() {
        Calculator calc = Calculator.instance.get();
        boolean result = calc.isPositive.test(6);

        Assertions.assertTrue(result);
    }

    @ParameterizedTest
    @MethodSource("sourseAdd")
    void testParam (int a, int b, int expected) {
        Calculator calc = Calculator.instance.get();
        int result = calc.multiply.apply(a, b);
        assertEquals(expected, result);

    }

    public static Stream<Arguments> sourseAdd() {
        return Stream.of(Arguments.of(2, 3, 6), Arguments.of(4, 5, 19), Arguments.of(4, 5, 20));
    }



}
