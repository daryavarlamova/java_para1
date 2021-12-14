package ru.netology.sqr;

public class SQRService {
    public int calculatecount(int min, int max) {
        int count=0;
        for (int i=10;i<100;i++) {
        int temp=i*i;
        if ((temp>=min) & (temp<=max)) count = count + 1;
        }
        return count;
    }

}
