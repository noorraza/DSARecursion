/**1. You are given a number n and a number m representing number of rows and columns in a maze.
2. You are standing in the top-left corner and have to reach the bottom-right corner. Only two moves are allowed 'h' (1-step horizontal) and 'v' (1-step vertical).
3. Complete the body of getMazePath function - without changing signature - to get the list of all paths that can be used to move from top-left to bottom-right.
**/

import java.io.*;
import java.util.*;

public class GetMazePaths {

    public static void main(String[] args) throws Exception {
        System.out.println(getMazePaths(1,1,3,3));
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if(sr==dr && sc==dc){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        ArrayList<String> hpaths = new ArrayList<>();
        ArrayList<String> vpaths = new ArrayList<>();
        if(sc<dc) {
             hpaths = getMazePaths(sr, sc + 1, dr, dc);
        }
        if(sr<dr) {
            vpaths = getMazePaths(sr + 1, sc, dr, dc);
        }

        ArrayList<String> mres = new ArrayList<>();

        for(String hpath:hpaths){
            mres.add("h"+hpath);
        }
        for(String vpath:vpaths){
            mres.add("v"+vpath);
        }

        return mres;
    }

}