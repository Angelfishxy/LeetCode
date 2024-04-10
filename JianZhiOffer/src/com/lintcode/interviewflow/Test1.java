package com.lintcode.interviewflow;

public class Test1 {
    public static void main(String[] args) {
        int count = rowTheBoat(8,2,13);
        System.out.println (count);
    }
    public static int rowTheBoat (float x, float y, float m) {
        // write code here
        int count = 0;
        while (true) {
            if (x <= y) {
                return -1;
            }
            m -= x;
            count++;
            if (m <= 0) {
                return count;
            } else {
                m += y;
                x *= 0.8;
            }
        }
    }
}

