import java.util.Scanner;

public class LastIndex {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Please Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            int arrEle = sc.nextInt();
            arr[i] = arrEle;
        }
        System.out.println("Enter the number that you need: ");
        int x = sc.nextInt();
        System.out.println(lastIndex(arr, 0, x));
    }

    public static int lastIndex(int[] arr, int idx, int x) {

        if (idx == arr.length)
            return -1;
        int liisa = lastIndex(arr, idx + 1, x);
        if (liisa == -1) {
            if (arr[idx] == x) {
                return idx;
            } else {
                return -1;
            }
        } else {
            return liisa;
        }
    }

}