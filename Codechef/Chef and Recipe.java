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
                int N = scan.nextInt();
                int[] arr = new int[N];
                for(int j = 0; j < N; j++) {
                    arr[j] = scan.nextInt();
                }
                HashMap<Integer, ArrayList<Integer>> map = new HashMap<Integer, ArrayList<Integer>>();
                int c = 0;
                for(int j = 0; j < arr.length; j++) {
                    if(!map.containsKey(arr[j])) {
                        ArrayList<Integer> temp = new ArrayList<Integer>();
                        temp.add(j);
                        temp.add(1);
                        map.put(arr[j], temp);
                    } else {
                        ArrayList<Integer> temp = map.get(arr[j]);
                        if(j - temp.get(0) != 1) {
                            c = 1;
                            break;
                        } else {
                            temp.set(0, j);
                            int val = temp.get(1);
                            temp.set(1, ++val);
                            map.put(arr[j], temp);
                        }
                    }
                }
                if(c == 1) {
                    System.out.println("NO");
                } else {
                    HashSet<Integer> x = new HashSet<Integer>();
                    int counter = 0;
                    for(ArrayList<Integer> w : map.values()) {
                        if(!x.contains(w.get(1))) {
                            x.add(w.get(1));
                        } else {
                            counter = 1;
                            break;
                        }
                    }
                    if(counter == 0) {
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
