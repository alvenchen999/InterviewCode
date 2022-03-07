package com.leetcode.quiz;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @ClassName Reverse
 * @Date 2021-08-28 7:03
 * @Version 1.0
 **/
public class StringStudy {
    //给你一个字符串 s ，逐个翻转字符串中的所有 单词。
    //说明：输入字符串 s 可以在前面、后面或者单词间包含多余的空格。翻转后单词间应当仅用一个空格分隔。翻转后的字符串中不应包含额外的空格。
    /*输入：s = "  hello world  "
    输出："world hello"
    解释：输入字符串可以在前面或者后面包含多余的空格，但是翻转后的字符不能包括。*/
    public static String reverseWords(String s) {
        //方法一：List
        s = s.trim();//除去开头和末尾的空白字符
        List<String> wordList = Arrays.asList(s.split("\\s+"));//正则匹配连续的空白字符作为分隔符分割
        Collections.reverse(wordList);
        return String.join(" ", wordList).trim();

        /*//方法二：字符串数组
        String res = "";
        String[] strArr = s.split("\\s+");
        for(int i = 0; i< strArr.length; i++){
            res = strArr[i]+" "+res;
        }
        return res.trim();*/
    }

    /**
     * @Description: 使用java语法实现I love China 输出 China love I
     * @param str:
     * @return: java.lang.String
     **/
    public static String swap(String str){//将字符反转
        //整体逆序
        StringBuilder stringBuilder = new StringBuilder(str);
        String strReverse = stringBuilder.reverse().toString();
        System.out.println(strReverse);
        //局部逆序
        String[] subStr = strReverse.split(" ");
        for(int i=0;i<subStr.length;i++){
            //System.out.println(subStr[i]);
            if( strReverse.contains(subStr[i]) ){
                strReverse = strReverse.replace( subStr[i], new StringBuilder(subStr[i]).reverse().toString());
            }
        }
        System.out.println(strReverse);
        return strReverse;
    }

    /*//使用java语法实现I love China 输出 China love I
    public static String swap(String str){
        String[] strArr = str.split(" ");
        String strRes = "";
        for(int i=0;i<strArr.length;i++){
            strRes = strArr[i]+" "+ strRes;
        }
        return strRes.trim();
    }*/

    //编写一个函数，其作用是将输入的字符串反转过来。输入字符串以字符数组 char[] 的形式给出。
    //不要给另外的数组分配额外的空间，你必须原地修改输入数组、使用 O(1) 的额外空间解决这一问题。
    //你可以假设数组中的所有字符都是 ASCII 码表中的可打印字符。
    //示例 1：  输入：["h","e","l","l","o"]  输出：["o","l","l","e","h"]
    public static void reverseCharArr(char[] s) {
        int len = s.length;
        for(int left = 0, right = len -1; left < right; ++left,--right){
            char tmp = s[left];
            s[left] = s[right];
            s[right] = tmp;
        }
        System.out.println(s);
    }

    public static String reverseString(String s){
        StringBuilder stringBuilder = new StringBuilder(s);
        return stringBuilder.reverse().toString();
    }

    //String 长度为n,要求把后 n/2反转（n+1/2）
    //stack压后半段，然后再取出来, chartAt
    public static String reverseLastHalf(String s){
        int len = s.length();
        int m = (len+1)/2;
        String strFront = s.substring(0,m);
        String strEnd = s.substring(m,len);
        /*System.out.println(strFront);
        System.out.println(strEnd);*/
        char[] arr = strEnd.toCharArray();
        for(int i = 0,j= arr.length-1;i<j; i++,j--){
            char tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }
        return strFront+ String.valueOf(arr);
    }

    //给你一个 32 位的有符号整数 x ，返回将 x 中的数字部分反转后的结果。
    //如果反转后整数超过 32 位的有符号整数的范围 [−231,  231 − 1] ，就返回 0。
    //假设环境不允许存储 64 位整数（有符号或无符号）。
    //输入：x = 123   输出：321
    public static int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            if (rev < Integer.MIN_VALUE / 10 || rev > Integer.MAX_VALUE / 10) {
                return 0;
            }
            int digit = x % 10;
            x /= 10;
            rev = rev * 10 + digit;
        }
        //System.out.println(rev);
        return rev;
    }

    //给你一个 32 位的无符号整数 x ，返回将 x 中的数字部分反转后的结果。
    public static int reverse2(int x) {
        String str = Integer.toString(x);
        StringBuilder stringBuilder = new StringBuilder(str);
        String strReverse = stringBuilder.reverse().toString();
        int rev = Integer.parseInt(strReverse);
        //System.out.println(rev);
        return rev;
    }

    //字符串S由大写字母组成，在一次移动中从中删除"BALLOON"(一个B，一个A，两个L，两个O，一个N)，得到一个短的字符串，
    //在剩下的短字符串中，如果还可以删除一个"BALLOON",那么移动次数加1。
    //统计移动的次数
    public static int removeNumbers(String S){
        int len = S.length();
        if (len == 0) return 0;
        int countB = 0;
        int countA = 0;
        int countL = 0;
        int countO = 0;
        int countN = 0;
        for(int i=0;i<len;i++){
            if(S.charAt(i)=='B'){
                countB++;
                continue;
            }
            if(S.charAt(i)=='A'){
                countA++;
                continue;
            }
            if(S.charAt(i)=='L'){
                countL++;
                continue;
            }
            if(S.charAt(i)=='O'){
                countO++;
                continue;
            }
            if(S.charAt(i)=='N'){
                countN++;
                continue;
            }
        }

        int count = countB;
        if(count>countA) count = countA;
        if(count>countN) count = countN;
        if(count>countO/2) count=countO/2;
        if(count>countL/2) count=countL/2;
        return count;
    }

    //字符串相加
    //给定两个字符串形式的非负整数 num1 和num2 ，计算它们的和。
    //例如："86043"+"5582"
    public static String addStrings(String num1, String num2){
        int i = num1.length()-1;
        int j = num2.length()-1;
        int add = 0;
        StringBuffer buffer = new StringBuffer();
        while (i>=0 || j>=0 || add != 0){
            int x = i >= 0 ? num1.charAt(i)-'0': 0;
            int y = j >= 0 ? num2.charAt(j)-'0': 0;
            int result = x + y + add;
            buffer.append(result % 10);
            add = result / 10;
            i--;
            j--;
        }

        buffer.reverse();
        return buffer.toString();
    }

    //给你一个仅包含小写英文字母和 '?' 字符的字符串 s，请你将所有的 '?' 转换为若干小写字母，使最终的字符串不包含任何连续重复的字符。
    public static String modifyString(String s){
        char[] chars = s.toCharArray();
        for(int i = 0; i < chars.length; i++){
            if(chars[i] == '?'){
                char ahead = i == 0 ? ' ':chars[i-1];
                char behind = i == chars.length-1 ? ' ':chars[i+1];
                char temp = 'a';
                while(temp==ahead || temp==behind){
                    temp++;
                }
                chars[i] = temp;
            }
        }
        return new String(chars);
    }

    /**
     * @Description: 使用代码判断一个数字是否是回文数
     * 设n是一任意自然数，如果n的各位数字反向排列所得自然数与n相等，则n被称为回文数。
     * @param x:
     * @return: boolean
     **/
    public static boolean isPalindrome(int x){
        String str = String.valueOf(x);
        StringBuilder builder = new StringBuilder(str);
        if( builder.reverse().toString().equals(str) ){
            return true;
        }
        return false;
    }



    public static void main(String[] args) {
        /*//String s = "  hello world  ";
        String s = "I love China";
        String res = reverseWords(s);
        System.out.println(res);*/

        /*//使用java语法实现I love China 输出 China love I
        String str = "I love China";
        //String str1 ="I love China China";
        swap(str);*/

        /*char[] s = {'h','e','l','l','o'};
        reverseCharArr(s);*/

        /*String str = reverseString("hello");
        System.out.println(str);*/

        /*String res = reverseLastHalf("abccbada");
        System.out.println(res);*/

        //reverse(-123);
        //reverse2(12323523);

        /*String S = "BAONXXOLL";
        //String S = "BAOOLLNNOLOLGBAX";
        int count = removeNumbers(S);
        System.out.println(count);*/

        String num1 = "86043";
        String num2 = "5582";
        String result = addStrings(num1,num2);
        System.out.println(result);

        /*String s = "??yw?ipkj?";
        String res = modifyString(s);
        System.out.println(res);*/

        //使用代码判断一个数字是否是回文数
        /*int x = 1231;
        System.out.println(isPalindrome(x));*/

    }
}
