/**
1. You are given a number n.
2. You are required to calculate the factorial of the number. Don't change the signature of factorial function.
**/

import java.io.*;
import java.util.*;

public class Factorial {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       int fact = factorial(n);
        System.out.println(fact);
    }

    public static int factorial(int n){
        int fact =n;
        if(n==1) {
            return 1;
        }
        fact *= factorial(n-1);

        return fact;
    }

}