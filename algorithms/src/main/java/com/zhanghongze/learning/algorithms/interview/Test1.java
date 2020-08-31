package com.zhanghongze.learning.algorithms.interview;

public class Test1 {

    public static void main(String [] args){
        Test1 test1 = new Test1();
        String s = test1.replace();
        System.out.println(s);
    }

    public String replace(){
        String s = "how are you";
        String newStr = "%20";

        // 替换前后字符串差值
        int x = newStr.length() - 1;

        // 原字符串中空格数量
        int num = 0;
        for(int i=0; i<s.length();i++){
            if(s.charAt(i) == ' '){
                num++;
            }
        }

        //替换后新字符串长度
        int newNum = s.length()+num* x;
        //替换后新字符串数组
        char [] cArray = new char [newNum];

        // 从后向前遍历原字符串
        for(int i= s.length()-1, j= newNum -1; i>=0; i--){
            if(s.charAt(i) == ' '){
                // 如果等于空格，则将替换后的字符串复制到新字符数组中
                for(int k = newStr.length()-1; k>=0;k--){
                    cArray[j--]= newStr.charAt(k);
                }
            }else {
                // 不是，则直接copy原字符串
                cArray[j--] = s.charAt(i);
            }
        }

        return new String(cArray);
    }
}
