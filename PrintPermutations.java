/**
 * 1. You are given a string str.
2. Complete the body of printPermutations function - without changing signature - to calculate and print all permutations of str.
**/

import java.io.*;
import java.util.*;

public class PrintPermutations {

    public static void main(String[] args) throws Exception {
        printPermutations("abc","");

    }

    public static void printPermutations(String str, String asf) {
        if(str.length()==0){
            System.out.println(asf);
        }
        for(int i=0;i<str.length();i++){
            char char0 = str.charAt(i);
            String leftq = str.substring(0,i);
            String rightq = str.substring(i+1);
            String ques = leftq+rightq;
            printPermutations(ques,asf+char0);
        }
        
    }

}