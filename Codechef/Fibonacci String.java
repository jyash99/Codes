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
		    for(int i = 0; i < t; i++) {
		        String s = scan.nextLine();
		        if(s.length() < 3) {
		            System.out.println("Dynamic");
		        } else {
		            HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		            for(int j = 0; j < s.length(); j++) {
		                char ch = s.charAt(j);
		                if(map.containsKey(ch)) {
		                    int val = map.get(ch);
		                    map.put(ch, ++val);
		                } else {
		                    map.put(ch, 1);
		                }
		            }
		            ArrayList<Integer> arr = new ArrayList<Integer>();
		            for(Integer val : map.values()) {
		                arr.add(val);
		            }
		            Collections.sort(arr);
		            int counter = 0;
		            for(int j = 2; j < arr.size(); j++) {
		                for(int k = 0; k < j; k++) {
		                    if(arr.get(j) != arr.get(j - 1) + arr.get(j - 2)) {
    		                    counter = 1;
    		                    break;
		                    }
		                }
		            }
		            int temp_counter = 0;
		            if(counter == 1) {
		                int temp1 = arr.get(0);
    		            int temp2 = arr.get(1);
    		            arr.set(0, temp2);
    		            arr.set(1, temp1);
    		            for(int j = 2; j < arr.size(); j++) {
    		                for(int k = 0; k < j; k++) {
    		                    if(arr.get(j) != arr.get(j - 1) + arr.get(j - 2)) {
        		                    temp_counter = 1;
        		                    break;
		                        }
    		                }
    		            }
		            }
		            if(counter == 1 && temp_counter == 1) {
		                System.out.println("Not");
		            } else {
		                System.out.println("Dynamic");
		            }
		        }
		    }
		} catch(Exception e) {
		    e.printStackTrace();
		}
	}
}
