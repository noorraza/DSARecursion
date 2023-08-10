/**
You are given a positive number n.
 You are required to print the counting from n to 1.
 You are required to not use any loops. Complete the body of print Decreasing function to achieve it.
 **/

import java.io.*;
import java.util.*;

public class PrintDecreasing {

    public static void main(String[] args) throws Exception {
        // write your code here
        printDecreasing(5);
    }

    public static void printDecreasing(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printDecreasing(n-1);
    }

}

