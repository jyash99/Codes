/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    static void printNcR(int n, int r) { 
        long p = 1, k = 1; 
        if (n - r < r) { 
            r = n - r; 
        } 
  
        if (r != 0) { 
            while (r > 0) { 
                p *= n; 
                k *= r; 
  
                // gcd of p, k  
                long m = __gcd(p, k); 
                p /= m; 
                k /= m; 
  
                n--; 
                r--; 
            } 
        } else { 
            p = 1; 
        } 
        System.out.println(p); 
    } 
  
    static long __gcd(long n1, long n2) { 
        long gcd = 1; 
  
        for (int i = 1; i <= n1 && i <= n2; ++i) { 
            if (n1 % i == 0 && n2 % i == 0) { 
                gcd = i; 
            } 
        } 
        return gcd; 
    }  
    
	public static void main (String[] args) throws java.lang.Exception
	{
		try {
		    Scanner scan = new Scanner(System.in);
		    int t = scan.nextInt();
		    for(int i = 0; i < t; i++) {
		        int n = scan.nextInt();
		        int k = scan.nextInt();
		        int[] arr = new int[n];
		        for(int j = 0; j < n; j++) {
		            arr[j] = scan.nextInt();
		        }
		        Arrays.sort(arr);
		        int last_ele = arr[k - 1];
		        int total = 0;
		        int num = 0;
		        for(int j = 0; j < n; j++) {
		            if(arr[j] == last_ele) {
		                if(j < k) {
		                    num++;
		                }
		                total++;
		            }
		        }
		        printNcR(total, num);
		    }
		} catch(Exception e) {
		    
		}
	}
}
