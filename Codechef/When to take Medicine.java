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
    		for(int k = 0; k < t; k++) {
    		    String[] str = scan.nextLine().split(":");
    		    Boolean leap = false;
    		    int year = Integer.parseInt(str[0]);
    		    if(year % 4 == 0) {
    		        if(year % 100 == 0) {
    		            if(year % 400 == 0) {
    		                leap = true;
    		            }
    		        } else {
    		            leap = true;
    		        }
    		    }
    		    int month = Integer.parseInt(str[1]);
    		    int day = Integer.parseInt(str[2]);
    		    int count = 0;
    		    if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
    		        count = (31 - day) / 2 + 1;
    		    } else if(month == 2) {
    		        if(leap) {
    		            count = (29 - day) / 2 + 1;
    		        } else {
    		            count = (61 - day) / 2;
    		        }
    		    } else {
    		        count = (63 - day) / 2;
    		    }
    		    System.out.println(count);
    		    
    		}
	    } catch(Exception e){
	        
	    }
	}
}
