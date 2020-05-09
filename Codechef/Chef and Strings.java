/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static String left_string(String s) {
        char[] ch = s.toCharArray();
        char first = ch[0];
        for(int j = 0; j < s.length() - 1; j++) {
            ch[j] = ch[j + 1];
        }
        ch[s.length() - 1] = first;
        String new_String = new String(ch);
        return new_String;
    }
    
    public static String right_string(String s) {
        char[] ch = s.toCharArray();
        char end = ch[s.length() - 1];
        for(int j = s.length() - 1; j >= 1; j--) {
            ch[j] = ch[j - 1];
        }
        ch[0] = end;
        String new_String = new String(ch);
        return new_String;
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		try {
		    Scanner scan = new Scanner(System.in);
		    int t = scan.nextInt();
		    scan.nextLine();
		    String[] strs = new String[t];
		    for(int i = 0; i < t; i++) {
		        strs[i] = scan.nextLine();
		    }
		    for(int i = 0; i < strs.length; i++) { 
		        if(strs[i].length() == 1) {
		            System.out.println("YES");
		        } else {
		            String left = left_string(strs[i]);
		            String right = right_string(strs[i]);
		            if(left.compareTo(right) == 0) {
		                System.out.println("YES");
		            } else {
		                System.out.println("NO");
		            }
		        }
		    }
		} catch(Exception e) {
		    
		}
	}
}
