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
		    for(int i = 0; i < t; i++) {
		        int n = scan.nextInt();
		        int q = scan.nextInt();
		        scan.nextLine();
		        String s = scan.nextLine();
		        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		        char[] ch = s.toCharArray();
		        for(int k = 0; k < ch.length; k++) {
		            if(!map.containsKey(ch[k])) {
		                map.put(ch[k], 1);
		            } else {
		                int val = map.get(ch[k]);
		                map.put(ch[k], ++val);
		            }
		        }
		        for(int j = 0; j < q; j++) {
		            int c = scan.nextInt();
		            int count = 0;
    		        for(Integer val : map.values()) {
    		            if(val > c) {
    		                count += (val - c);
    		            }
    		        }
    		        System.out.println(count);
		        }
		    }
		} catch(Exception e) {
		    
		}
	}
}
