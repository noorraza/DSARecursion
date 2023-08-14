/**1. You are given a number n representing number of stairs in a staircase.
2. You are standing at the bottom of staircase. You are allowed to climb 1 step, 2 steps or 3 steps in one move.
3. Complete the body of getStairPaths function - without changing signature - to get the list of all paths that can be used to climb the staircase up.
Use sample input and output to take idea about output.
**/
import java.io.*;
import java.util.*;

public class GetStairPaths {

    public static void main(String[] args) throws Exception {
        System.out.println(getStairPaths(4));

    }

    public static ArrayList<String> getStairPaths(int n) {
        if(n==0){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        } else if (n<0) {
            ArrayList<String> bres = new ArrayList<>();
            return bres;
        }

        ArrayList<String> paths1 = getStairPaths(n-1);
        ArrayList<String> paths2 = getStairPaths(n-2);
        ArrayList<String> paths3 = getStairPaths(n-3);

        ArrayList<String> mres = new ArrayList<>();

        for(String path:paths1){
            mres.add(1+path);
        }
        for(String path:paths2){
            mres.add(2+path);
        }
        for(String path:paths3){
            mres.add(3+path);
        }

        return mres;
    }

}