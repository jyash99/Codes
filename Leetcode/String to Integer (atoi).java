class Solution {
    public int myAtoi(String str) {
        str = str.trim();
        if(str.isBlank()) {
            return 0;
        }
        if(str.length() == 1) {
            if(str.charAt(0) == '+' || str.charAt(0) == '-') {
                return 0;
            }
        }
        boolean negative = false;
        double num = 0;
        int counter = 0;
        int start = 0;
        for(int i = 0; i < str.length(); i++) {
            if((str.charAt(i) == '-' || str.charAt(i) == '+') && counter == 0) {
                negative = (str.charAt(i) == '-') ? true : false;
                counter = 1;
                start = i;
            } else if(Character.isDigit(str.charAt(i))) {
                start = i;
                break;
            } else {
                return 0;
            }
        }
        String s = new String();
        for(int i = start; i < str.length(); i++) {
            if(Character.isDigit(str.charAt(i))) {
                s += Character.getNumericValue(str.charAt(i));
            } else {
                break;
            }
        }
        num = Double.parseDouble(s);
        num = (negative) ? (-1) * num : num;
        if(num > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        } else if(num < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        } else {
            return (int)num;
        }
    }
}