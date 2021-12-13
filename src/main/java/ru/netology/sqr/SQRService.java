package ru.netology.sqr;

public class SQRService {
    public int countTheNumberOfSquares(int min, int max) {
      int counter = 0;
        for (int i = 10; i <= 99; i++) {
                if (i * i >= min & i * i <= max){
            counter++;
            }
        }
        System.out.println(counter);
        return counter;
    }
}


