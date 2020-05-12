/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static int sequence(int n) {
        int[] arr = new int[n];
        arr[0] = 0;
        int index = 0;
        int c = 0;
        for(int i = 1; i < n; i++) {
            int end = arr[i - 1];
            for(int j = i - 2; j >= 0; j--) {
                if(arr[j] == end) {
                    index = j;  
                    c = 1;
                    break;
                }
            }
            if(c == 1) {
                arr[i] = (i - 1) - index;
                c = 0;
            } else {
                arr[i] = 0;
            }
        }
        int reqNum = arr[arr.length - 1];
        int count = 0;
        for(Integer val : arr) {
            if(val == reqNum) {
                count++;
            }
        }
        return count;
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		try {
		    Scanner scan = new Scanner(System.in);
		    int t = scan.nextInt();
		    for(int i = 0; i < t; i++) {
		        int N = scan.nextInt();
		        int count = sequence(N);
		        System.out.println(count);
		    } 
		} catch(Exception e) {
		    e.printStackTrace();
		}
	}
}
