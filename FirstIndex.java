import java.io.*;
import java.util.*;

public class FirstIndex {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Please Enter the elements of the array: ");
        for(int i=0;i<n;i++){
            int arrEle = sc.nextInt();
            arr[i] = arrEle;
        }
        System.out.println("Enter the number that you need: ");
        int x = sc.nextInt();
        System.out.println(firstIndex(arr,0,x));
    }

    public static int firstIndex(int[] arr, int idx, int x){
        if(idx == arr.length)
            return -1;
        if(arr[idx] == x){
            return idx;
        }
        else{
            int fisa = firstIndex(arr,idx+1,x);
            return fisa;
        }
    }

}