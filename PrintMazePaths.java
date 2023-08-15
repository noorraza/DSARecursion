/**1. You are given a number n and a number m representing number of rows and columns in a maze.
2. You are standing in the top-left corner and have to reach the bottom-right corner. Only two moves are allowed 'h' (1-step horizontal) and 'v' (1-step vertical).
3. Complete the body of pri tMazePath function - without changing signature - to print the list of all paths that can be used to move from top-left to bottom-right.**/


import java.io.*;
	import java.util.*;

	public class PrintMazePaths {

	    public static void main(String[] args) throws Exception {
			printMazePaths(1,1,3,3,"");
	    }

	    // sr - source row
	    // sc - source column
	    // dr - destination row
	    // dc - destination column
	    public static void printMazePaths(int sr, int sc, int dr, int dc, String psf) {
	        if(sr==dr && sc==dc){
				System.out.println(psf);
				return;
			}
			if(sr<dr){
				printMazePaths(sr+1,sc,dr,dc,"v"+psf);
			}
			if(sc<dc){
				printMazePaths(sr,sc+1,dr,dc,"h"+psf);
			}

	    }

	}