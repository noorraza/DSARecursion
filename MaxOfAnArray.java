import java.io.*;
import java.util.*;

public class MaxOfAnArray {

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
        System.out.println(maxOfArray(arr,0));
    }

    public static int maxOfArray(int[] arr, int idx){
        if(idx == arr.length-1){
            return arr[idx];
        }
        int misa = maxOfArray(arr,idx+1);
        if(misa > arr[idx]){
            return misa;
        }
        else {
            return arr[idx];
        }
    }

}