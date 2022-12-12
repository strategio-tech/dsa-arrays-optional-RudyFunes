package tech.strategio;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class E04Test {
    @DisplayName("Array of Products except Self")
    @ParameterizedTest(name = "{index} => {0} is {1}")
    @MethodSource("inputValues")
    void inputValues(int[] values, int[] result) {
        E04 exercise = new E04();
        int[] val = exercise.arrayOfProducts(values);
        assertEquals(Arrays.toString(result), Arrays.toString(val));
    }
    private static Stream<Arguments> inputValues() {
        return Stream.of(
                Arguments.arguments(new int[] {1,2,3,4}, new int[] {24,12,8,6}),
                Arguments.arguments(new int[] {-5,2,-4,14,-6}, new int[] {672,-1680,840,-240,560}),
                Arguments.arguments(new int[] {-1,-1,-1}, new int[] {1,1,1}),
                Arguments.arguments(new int[] {-1,-1,-1,-1}, new int[] {-1,-1,-1,-1}),
                Arguments.arguments(new int[] {0,0,1,2,3,4,5,6,7,8,9}, new int[] {0,0,0,0,0,0,0,0,0,0,0}),
                Arguments.arguments(new int[] {0,1,2,3,4,5,6,7,8,9}, new int[] {362880,0,0,0,0,0,0,0,0,0})
        );
    }
}
