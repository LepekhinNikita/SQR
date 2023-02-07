package ru.netology.sqr;

public class SQRService {
    public int calculateSqrt(int min, int max) {
        int result = 0;

        for (int i = 10; i <= 99; i++) {
            if ((i * i >= min) & (i * i <= max)) {
                result++;
            }
        }
        return result;
    }
}