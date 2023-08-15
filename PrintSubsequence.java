/**1. You are given a string str.
2. Complete the body of printSS function - without changing signature - to calculate and print all subsequences of str.
**/

import java.io.*;
import java.util.*;

public class PrintSubsequence {

    public static void main(String[] args) throws Exception {
        printSS("abc", "");
    }

    public static void printSS(String str, String ans) {
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        char char0 = str.charAt(0);
        String ros = str.substring(1);
        printSS(ros,ans+"");
        printSS(ros,ans+char0);
    }

}