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
		    scan.nextLine();
		    HashMap<String, Integer> map = new HashMap<String, Integer>();
		    map.put("monday", 1);
		    map.put("tuesday", 2);
		    map.put("wednesday", 3);
		    map.put("thursday", 4);
		    map.put("friday", 5);
		    map.put("saturday", 6);
		    map.put("sunday", 7);
		    for(int i = 0; i < t; i++) {
		        String start = scan.next();
		        String end = scan.next();
		        int L = scan.nextInt();
		        int R = scan.nextInt();
		        int diff = (map.get(end) - map.get(start));
		        if(diff >= 0) {
		            diff += 1;
		        } else {
		            diff += 8;
		        }
		        int m = 0;
		        int count = 0;
		        while(diff <= R) {
		            if(diff >= L && diff <= R) {
		                m = diff;
		                count++;
		            }
		            diff += 7;
		        }
		        
		        if(count == 0) {
		            System.out.println("impossible");
		        } else if(count == 1) {
		            System.out.println(m);
		        } else {
		            System.out.println("many");
		        }
		    } 
		} catch(Exception e) {
		    e.printStackTrace();
		}
	}
}
