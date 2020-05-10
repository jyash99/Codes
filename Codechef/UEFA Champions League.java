/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static int check(int home_goal, int away_goal) {
        int points = 0;
        if(home_goal == away_goal) {
            points += 1;
        } else if(home_goal > away_goal) {
            points += 3;
        }
        return points;
    }
    
    public static void insert(String home_team, int home_goal, String away_team, int away_goal, HashMap<String, ArrayList<Integer>> map) {
        int points = check(home_goal, away_goal);
        int goal_diff = home_goal - away_goal;
        if(map.containsKey(home_team)) {
            ArrayList<Integer> arr = map.get(home_team);
            int arr_points = arr.get(0);
            arr_points += points;
            int arr_diff = arr.get(1);
            arr_diff += goal_diff;
            arr.clear();
            arr.add(arr_points);
            arr.add(arr_diff);
            map.put(home_team, arr);
        } else {
            ArrayList<Integer> arr = new ArrayList();
            arr.add(points);
            arr.add(goal_diff);
            map.put(home_team, arr);
        }
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
	    try {
	        Scanner scan = new Scanner(System.in);
	        int t = scan.nextInt();
    		scan.nextLine();
    		for(int i = 0; i < t; i++) {
    		    HashMap<String, ArrayList<Integer>> map = new HashMap();
    		    for(int j = 0; j < 12; j++) {
    		        String home_team = scan.next();
    		        int home_goal = scan.nextInt();
    		        scan.next();
    		        int away_goal = scan.nextInt();
    		        String away_team = scan.next();
    		        insert(home_team, home_goal, away_team, away_goal, map);
    		        insert(away_team, away_goal, home_team, home_goal, map);
    		    }
    		    List<Map.Entry<String, ArrayList<Integer>>> list = new ArrayList(map.entrySet());
    		    Collections.sort(list, new Comparator<Map.Entry<String, ArrayList<Integer>>>() {
    		        public int compare(Map.Entry<String, ArrayList<Integer>> o1, Map.Entry<String, ArrayList<Integer>> o2) {
    		            if(o1.getValue().get(0) < o2.getValue().get(0)) {
    		                return 1;
    		            } else if(o1.getValue().get(0) > o2.getValue().get(0)) {
    		                return -1;
    		            } else {
    		                if(o1.getValue().get(1) < o2.getValue().get(1)) {
    		                    return 1;
    		                } else if(o1.getValue().get(1) > o2.getValue().get(1)) {
    		                    return -1;
    		                } else {
    		                    return 0;
    		                }
    		            }
    		        }
    		    });
    		    int c = 0;
    		    for(Map.Entry<String, ArrayList<Integer>> arr : list) {
    		        if(c == 2) {
    		            break;
    		        } else {
    		            System.out.print(arr.getKey() + " ");
    		            c++;
    		        }
    		    }
    		    System.out.println();
    		}
	    } catch(Exception e) {
	 
	    } 
	}
}
