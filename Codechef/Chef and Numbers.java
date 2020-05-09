/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws Exception
	{
	    try {
	        Scanner scan = new Scanner(System.in);
    		int t = scan.nextInt();
    		for(int i = 0; i < t; i++) {
    		    int n = scan.nextInt();
    		    int[] list = new int[n];
    		    for(int j = 0; j < n; j++) {
    		        list[j] = scan.nextInt();
    		    } 
    		    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    		    int c = 0;
    		    for(int j = 0; j < n; j++) {
    		        if(c == 1) {
    		            c = 0;
    		            continue;
    		        }
    		        if(j == n - 1) {
    		            if(!map.containsKey(list[j])) {
    		                map.put(list[j], 1);
    		            } else {
    		                int val = map.get(list[j]);
    		                map.put(list[j], ++val);
    		            }
    		        } else {
    		            if(list[j] == list[j + 1]) {
        		            c = 1;
        		            if(!map.containsKey(list[j + 1])) {
        		                map.put(list[j + 1], 1);
        		            } else {
        		                int val = map.get(list[j + 1]);
        		                map.put(list[j + 1], ++val);
        		            }
        		        } else {
        		            if(!map.containsKey(list[j])) {
        		                map.put(list[j], 1);
        		            } else {
        		                int val = map.get(list[j]);
        		                map.put(list[j], ++val);
        		            }
        		        }
    		        }
    		    }
    		    int max = 0;
    		    for(Integer val : map.values()) {
    		        if(val > max) {
    		            max = val;
    		        }
    		    }
    		    int key = Integer.MAX_VALUE;
    		    for(Integer ele : map.keySet()) {
    		        if(map.get(ele) == max) {
    		            if(ele < key) {
    		                key = ele;
    		            }
    		        }
    		    }
    		    System.out.println(key);
    		}
	    } catch(Exception e) {
	        
	    }
	}
}
