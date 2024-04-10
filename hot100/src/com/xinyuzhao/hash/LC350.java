package com.xinyuzhao.hash;

import java.util.ArrayList;

public class LC350 {
    public static void main(String[] args) {

    }
    /*数组交集II
    给你两个整数数组 nums1 和 nums2 ，请你以数组形式返回两数组的交集。
    返回结果中每个元素出现的次数，应与元素在两个数组中都出现的次数一致（如果出现次数不一致，则考虑取较小值）。
    可以不考虑输出结果的顺序。
     */
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> ls = new ArrayList<> ();
        for (int i = 0; i < nums1.length; i++) {
            ls.add (nums1[i]);
        }
        ArrayList<Integer> resls = new ArrayList<> ();
        for (int i = 0; i < nums2.length; i++) {
            if(ls.contains (nums2[i])){
                resls.add (nums2[i]);
                ls.remove ((Integer) nums2[i]);
            }
        }
        int i = 0;
        int[] arr = new int[resls.size ()];
        for (Integer j : resls) {
            arr[i++] = j;
        }
        return arr;
    }
}
