package tech.strategio;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class E03Test {
    @DisplayName("Max Profit")
    @ParameterizedTest(name = "{index} => {0} is {1}")
    @MethodSource("inputValues")
    void inputValues(int[] values, int result) {
        E03 exercise = new E03();
        int val = exercise.maxProfit(values);
        assertEquals(result, val);
    }
    private static Stream<Arguments> inputValues() {
        return Stream.of(
                Arguments.arguments(new int[] {7,1,5,3,6,4}, 5),
                Arguments.arguments(new int[] {7,6,4,3,1}, 0),
                Arguments.arguments(new int[] {0}, 0),
                Arguments.arguments(new int[] {100}, 0),
                Arguments.arguments(new int[] {1, 100}, 99),
                Arguments.arguments(new int[] {100, 1}, 0),
                Arguments.arguments(new int[] {100, 100}, 0)
        );
    }
}
