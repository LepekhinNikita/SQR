package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/sqr.csv")
    public void shouldCalculateForLimitValues(int expected, int min, int max) {
        SQRService service = new SQRService();

        int actual = service.calculateSqrt(min, max);

        Assertions.assertEquals(expected, actual);
    }


}