package com.xinyuzhao.hash;

import javax.imageio.metadata.IIOMetadataFormatImpl;
import java.util.HashSet;

public class LC349 {
    //数组交集
    public static void main(String[] args) {

    }
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hs1 =new HashSet<> ();
        for (int i = 0; i < nums1.length; i++) {
            hs1.add (nums1[i]);
        }
        HashSet<Integer> hs2 = new HashSet<> ();
        for (int i = 0; i < nums2.length; i++) {
            if(hs1.contains (nums2[i])){
                hs2.add (nums2[i]);
            }
        }
        int[] arr = new int[hs2.size ()];
        int i = 0;
        for (Integer j : hs2) {
            arr[i++] = j;
        }
        return arr;
    }
}
