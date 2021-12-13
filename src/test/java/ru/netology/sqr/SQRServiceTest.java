package ru.netology.sqr;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;


class SQRServiceTest {

    @ParameterizedTest
    @CsvSource(value = {"counter,100,500, 13"})
    void countTheNumberOfSquares(String name, int min, int max, int expected) {
        SQRService service = new SQRService();

        int actual = service.countTheNumberOfSquares(min, max);

        assertEquals(expected, actual);
    }

}