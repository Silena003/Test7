package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
     void rangeNumbers() {
        SQRService sqrService = new SQRService();
        int expected = 3;
        int actual = sqrService.rangeNumbers(200,300);
    }
}