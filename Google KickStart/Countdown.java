import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);
            int t = scan.nextInt();
            ArrayList<Integer> new_arr = new ArrayList<Integer>();
            for(int i = 0; i < t; i++) {
                int N = scan.nextInt();
                int K = scan.nextInt();
                ArrayList<Integer> arr = new ArrayList<Integer>();
                for(int j = 0; j < N; j++) {
                    arr.add(scan.nextInt());
                }
                scan.nextLine();
                int count = 0;
                int num = K;
                int index = 0;
                for(int k = 0; k < arr.size(); k++) {
                    if(arr.get(k) == K) {
                        index = k;
                        for(int h = index; h < arr.size(); h++) {
                            if (arr.get(h) == K) {
                                K--;
                                if(K == 0) {
                                    count++;
                                }
                                continue;
                            }
                            break;
                        }
                        K = num;
                    }
                }
                new_arr.add(count);
            }
            int q = 1;
            for(int i = 0; i < new_arr.size(); i++) {
                System.out.println("Case #" + q + ": " + new_arr.get(i));
                q++;
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
