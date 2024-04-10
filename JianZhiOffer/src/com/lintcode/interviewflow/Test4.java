package com.lintcode.interviewflow;

public class Test4 {
    public static void main(String[] args) {

    }
    public static boolean[] checkStrInMap (String[][] map, String[] strArr) {
        // write code here
        for (int i = 0; i < strArr.length; i++) {
            String[][] copyMap = new String[map.length][map[0].length];
            for (int i = 0; i < copyMap.length; i++) {
                System.arraycopy (copyMap[i], 0, map[i], 0, copyMap[i].length);
            }
        }
    }
    public static boolean isStrInMap(String[][] map, char a){
        
    }
}
