package ru.netology.sqr;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;


class SQRServiceTest {

    @ParameterizedTest
    @CsvSource(value = {"checking the boundary values for the input data 10 & 99,100,9801, 90",
            "checking the boundary values for the input data 11 & 98, 121, 9604, 88",
            "checking the boundary values for the input data 9 & 100, 81, 10000, 90",
            "checking the boundary values for the input data 50 & 60, 2500, 3600, 11",
            "checking the boundary values for the input data 0 & 0, 0, 0, 0"})
    void countTheNumberOfSquares(String name, int min, int max, int expected) {
        SQRService service = new SQRService();

        int actual = service.countTheNumberOfSquares(min, max);

        assertEquals(expected, actual);
    }

}