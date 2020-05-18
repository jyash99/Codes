class Solution {
    public boolean isPalindrome(int x) {
        int num = x;
        if(x < 0) {
            return false;
        } 
        
        double reversed = 0;
        while(num > 0) {
            reversed = (reversed * 10) + (num % 10);
            num /= 10;
        }
        if(reversed > Integer.MAX_VALUE) {
            return false;
        }
        if((int)reversed == x) {
            return true;
        }
        return false;
    }
}