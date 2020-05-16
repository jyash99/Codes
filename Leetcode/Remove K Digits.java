class Solution {
    public String removeKdigits(String num, int k) {
        if(k == num.length()) {
            return "0";
        }
        
        if(k == 0) {
            return num;
        }
        
        Stack<Character> stack = new Stack<Character>();
        for(int i = 0; i < num.length(); i++) {
            char ch = num.charAt(i);
            while(!stack.isEmpty() && k > 0) {
                if(stack.peek() > ch) {
                    stack.pop();
                    k--;
                } else {
                    break;
                }
            }
            stack.push(ch);
        }
        for(int i = 0 ; i < k; i++) {
            stack.pop();
        }
        StringBuilder str = new StringBuilder();
        while(!stack.isEmpty()) {
            str.append(stack.peek());
            stack.pop();
        }
        str.reverse();
        String new_str = str.toString();
        int index = 0;
        int c = 0;
        for(int i = 0; i < new_str.length(); i++) {
            if(new_str.charAt(i) != '0') {
                index = i;
                c = 1;
                break;
            }
        }
        if(c == 0) {
            return "0";
        }
        return new_str.substring(index, new_str.length());
    }
}