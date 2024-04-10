package com.lintcode.interviewflow;

public class Test3 {
    public static void main(String[] args) {
        System.out.println (CountNumber (20));
    }
    public static String CountNumber (int n) {
        // write code here
        int[] count = new int[10];
        for (int i = 1; i <= n; i++) {
            String tmp = String.valueOf (i);
            for (int j = 0; j < tmp.length (); j++) {
                count[Integer.valueOf (tmp.charAt (j)-'0')]++;
            }
        }
        String str ="";
        for (int i = 0; i < count.length-1; i++) {
            str = str + count[i] +" ";
        }
        str += count[count.length-1];
        return str;
    }


    
}
