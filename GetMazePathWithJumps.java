/**1. You are given a number n and a number m representing number of rows and columns in a maze.
 2. You are standing in the top-left corner and have to reach the bottom-right corner.
 3. In a single move you are allowed to jump 1 or more steps horizontally (as h1, h2, .. ), or 1 or more steps vertically (as v1, v2, ..) or 1 or more steps diagonally (as d1, d2, ..).
 4. Complete the body of getMazePath function - without changing signature - to get the list of all paths that can be used to move from top-left to bottom-right.
 Use sample input and output to take idea about output.
 **/

import java.io.*;
import java.util.*;

public class GetMazePathWithJumps {

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
        ArrayList<String> paths = new ArrayList<>();
        //Horizontal Move
        for(int move=1;move<=dc-sc;move++){
            ArrayList<String> horMoves = getMazePaths(sr,sc+move,dr,dc);
            for(String horMove:horMoves){
                paths.add("h"+move+horMove);
            }
        }

        //Vertical Move
        for(int move=1;move<=dr-sr;move++){
            ArrayList<String> verMoves = getMazePaths(sr+move,sc,dr,dc);
            for(String verMove:verMoves){
                paths.add("v"+move+verMove);
            }
        }

        //Diagonal Move
        for(int move=1;move<=dr-sr && move<=dc-sc;move++){
            ArrayList<String> diaMoves = getMazePaths(sr+move,sc+move,dr,dc);
            for(String diaMove:diaMoves){
                paths.add("d"+move+diaMove);
            }
        }

        return paths;
    }

}