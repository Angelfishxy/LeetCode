package com.lintcode.interviewflow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ZJ9 {
    /*如果这个数被3整除，打印fizz。
如果这个数被5整除，打印buzz。
如果这个数能同时被3和5整除，打印fizz buzz。
如果这个数既不能被 3 整除也不能被 5 整除，打印数字本身。

     */
    public static void main(String[] args) {


    }
    public  static ArrayList<String> fizzBuzz(int num){
        ArrayList<String> list = new ArrayList<> ();
        for (int i = 1; i < num; i++) {
            if(i% 15 == 0){
                list.add ("fizz buzz");
            }else if (i % 5 ==0){
                list.add ("fizz ");
            }else if (i % 3 ==0){
                list.add ("buzz");
            }else{
                list.add (String.valueOf (i));
            }
        }
        return list;
    }

}
