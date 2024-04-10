package com.xinyuzhao.hash;

import javax.print.attribute.standard.ReferenceUriSchemesSupported;

public class LC242 {
    /*有效字母异位词
    给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。

注意：若 s 和 t 中每个字符出现的次数都相同，则称 s 和 t 互为字母异位词。

     */
    public boolean isAnagram(String s, String t) {
        int[] sum = new int[26];
        for (int i = 0; i < s.length (); i++) {
            sum[s.charAt (i)-'a']++;
        }
        for (int i = 0; i < t.length (); i++) {
            sum[t.charAt (i)-'a']--;
        }
        for (int i = 0; i < sum.length; i++) {
            if(sum[i] != 0){
                return false;
            }
        }
        return true;
    }
}
