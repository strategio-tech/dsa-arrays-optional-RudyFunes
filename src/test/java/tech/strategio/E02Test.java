package tech.strategio;

import org.junit.jupiter.api.DisplayName;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class E02Test {
    @DisplayName("Valid Anagram")
    @ParameterizedTest(name = "{index} => {0} and {1} is {2}")
    @MethodSource("arrayToBoolean")
    void arrayToBoolean(String s, String t, Boolean result) {
        E02 exercise = new E02();
        boolean val = exercise.isAnagram(s,t);
        assertEquals(result, val);
    }
    private static Stream<Arguments> arrayToBoolean() {
        return Stream.of(
                Arguments.arguments("anagram", "anagram", true),
                Arguments.arguments("anagram", "nagaram", true),
                Arguments.arguments("cat", "cats", false),
                Arguments.arguments("x", "x", true),
                Arguments.arguments("x", "y", false),
                Arguments.arguments("rat", "car", false),
                Arguments.arguments("bok", "book", false),
                Arguments.arguments("loot", "tool", true),
                Arguments.arguments("lot", "tool", false)
        );
    }
}
