package com.lintcode.interviewflow;

import javax.print.attribute.standard.ReferenceUriSchemesSupported;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        System.out.println (chou(103));
    }
    public static int chou(int num ){
        ArrayList<Integer> list = new ArrayList<Integer> ();
        list.add(1);
        int n =1;
        while(true){
            if(isChou2 (list,n)){
                num--;
                if(num ==0){
                    return list.get (list.size ()-1);
                }else{
                n++;
            }
            }else{
                n++;
            }
        }

    }
    public static boolean isChou(int num){
        while(true){
            if(num == 1){
                return true;
            }
            if(num%2==0){
                num /= 2;
                continue;
            }
            if(num%3==0){
                num /= 3;
                continue;
            }
            if(num%5==0){
                num /= 5;
                continue;
            }
            return false;
        }
    }

    public static boolean isChou2(ArrayList<Integer> list,int num){
        if(num == 1){
            return true;
        }
        if(num % 2==0){
            if(contain(list,num/2)){
                list.add (num);
                return true;
            }
        }
        if(num % 3==0){
            if(contain(list,num/3)){
                list.add (num);
                return true;
            }
        }
        if(num % 5==0){
            if(contain(list,num/5)){
                list.add (num);
                return true;
            }
        }
        return false;
    }

    public static boolean contain(ArrayList<Integer> list,int num){
        for (int i = 0; i < list.size (); i++) {
            if(num == list.get (i)){
                return true;
            }
        }
        return false;
    }

}
