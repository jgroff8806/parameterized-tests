package com.example;

// Import necessary classes and static methods for testing
import static org.junit.jupiter.api.Assertions.assertEquals; // Importing the assertEquals method for assertions

import java.util.stream.Stream; // Importing Stream class to create a stream of arguments

import org.junit.jupiter.params.ParameterizedTest; // Importing the ParameterizedTest annotation for parameterized tests
import org.junit.jupiter.params.provider.Arguments; // Importing Arguments class to package test data
import org.junit.jupiter.params.provider.MethodSource; // Importing MethodSource annotation to specify the method providing test data

// Test class for MathUtils
class MathUtilsTest {

    // Parameterized test method that takes two parameters: an integer (number) and the expected square value (expectedSquare)
    @ParameterizedTest
    @MethodSource("provideNumbersForSquare")
    void testSquare(int number, int expectedSquare) {
        // Create an instance of the class to be tested
        MathUtils mathUtils = new MathUtils();
        // Assert that the output of square matches the expected value
        assertEquals(expectedSquare, mathUtils.square(number));
    }

    // Static method that provides a stream of arguments for the parameterized test
    private static Stream<Arguments> provideNumbersForSquare() {
        // Return a stream of arguments, each consisting of a number and its expected square
        return Stream.of(
                Arguments.of(0, 0),     // Test case: 0 squared is 0
                Arguments.of(1, 1),     // Test case: 1 squared is 1
                Arguments.of(2, 4),     // Test case: 2 squared is 4
                Arguments.of(3, 9),     // Test case: 3 squared is 9
                Arguments.of(4, 16)     // Test case: 4 squared is 16
        );
    }
}
