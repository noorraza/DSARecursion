/** 1. You are given a number x.
2. You are given another number n.
3. You are required to calculate x raised to the power n. Don't change the signature of power function.
**/

import java.io.*;
import java.util.*;

public class PowerLogarithmic {

    public static void main(String[] args) throws Exception {
        // write your code here
         Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(power(x,n));
        
    }

    public static int power(int x, int n){
        int mult = 1;
        if(n==0){
            return 1;
        }
        if(n%2 == 0){
            mult = power(x,n/2) * power(x,n/2);
            
        }
        else {
             mult = power(x,n/2) * power(x,n/2) * x;
        }
        return mult;
    }

}