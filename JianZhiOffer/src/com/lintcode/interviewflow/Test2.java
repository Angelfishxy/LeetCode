package com.lintcode.interviewflow;

public class Test2 {
    public static void main(String[] args) {
        int[] arr = {9,2,3,6,5};
        int count = insert_sort (arr);
        System.out.println (count);
    }
    public static int shell_sort (int[] numlist, int[] gaplist) {
        // write code here
        return 0;
    }

    public static int insert_sort(int[] arr){
        int count = 0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]<arr[i-1]){
                count++;
                for (int j = i-1; j >=0; j--) {
                    if(arr[i] < arr[j] && arr[i]>= arr[j-1]){
                        int tmp = arr[i];
                        for(int k =i;k>j+1;k--){
                            arr[k] = arr[k-1];
                        }
                        arr[j+1] = tmp;
                    }
                }
            }
        }
        return count;
    }
}
