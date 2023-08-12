import java.io.*;
import java.util.*;

public class DisplayArrayInReverse {

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
        displayArrReverse(arr,0);
    }

    public static void displayArrReverse(int[] arr, int idx) {
        if(idx == arr.length){
            return;
        }
        displayArrReverse(arr,idx+1);
        System.out.println(arr[idx]);

    }

}