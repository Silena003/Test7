package ru.netology.sqr;

public class SQRService {
    public int rangeNumbers(int down, int up) {
        int counter = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= down && i * i <= up) {
                counter = counter + 1;
            }
            System.out.println(counter);
        }
        return counter;
    }

}


