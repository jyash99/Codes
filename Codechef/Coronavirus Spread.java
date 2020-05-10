/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    try {
	        Scanner scan = new Scanner(System.in);
    		int t = scan.nextInt();
    		for(int k = 0; k < t; k++) {
    		    int n = scan.nextInt();
    		    ArrayList<Integer> arr = new ArrayList<Integer>();
    		    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    		    for(int j = 0; j < n; j++) {
    		        int num = scan.nextInt();
    		        arr.add(num);
    		        map.put(num, 1);
    		    }
    		    for(int i = 0; i < n; i++) {
    		        int x = arr.get(i);
    		        int y = x;
    		        for(int j = i + 1; j < n; j++) {
    		            if((x + 2) == arr.get(j) || (x + 1) == arr.get(j)) {
    		                int val = map.get(y);
    		                map.put(y, ++val);
    		                x = arr.get(j);
    		            }
    		        }
    		    }
    		    int max = 0;
    		    int min = 0;
    		    for(Integer val : map.values()) {
    		        if(max < val) {
    		            max = val;
    		        }
    		    }
    		    if(max == 1) {
    		        min = 1;
    		    } else {
    		        if(map.get(arr.get(0)) == 1) {
        		        min = 1;
        		    } else {
        		        if(max == arr.size()) {
        		            min = max;
        		        } else {
        		            min = map.get(arr.get(0));
        		            int z = 0;
        		            for(Integer val : map.values()) {
        		                if(val == 1 && z == 0) {
        		                    z = 1;
        		                    continue;
        		                }
        		                if(z == 1) {
        		                    if(min > val) {
        		                        min = val;
        		                    }
        		                    z = 0;
        		                }
        		            }
        		        }
        		    }
    		    }
    		    System.out.println(min + " " + max);
    		}
	    } catch(Exception e) {
	        
	    }
	}
}
