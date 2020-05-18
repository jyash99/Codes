class Solution {
    public int reverse(int x) {
        int num = x;
        boolean negative = false;
        if(num < 0) {
            num = (-1) * num;
            negative = true;
        } 
        double reversed = 0;
        while(num > 0) {
            int pop = num % 10;
            reversed = (reversed) * 10 + (double)pop;
            num /= 10;
        }
        if(reversed > Integer.MAX_VALUE) {
            return 0;
        }
        return negative ? (-1) * (int)reversed : (int)reversed;
    }
}