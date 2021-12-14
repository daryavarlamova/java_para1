package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {
    @CsvSource(value={"200,300,3","1,99,0","1,100,1","9801,9802,1","9802,9803,0"})
    @ParameterizedTest
    void shouldCalculate(int min, int max, int expected) {
        SQRService service = new SQRService();

        // вызываем целевой метод:
        int count = service.calculatecount(min, max);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, count);
    }
}