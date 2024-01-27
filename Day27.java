//Roman Number to Integer
//Given a string in roman no format (s)  your task is to convert it to an integer . Various symbols and their values are given below.
/*
I 1
V 5
X 10
L 50
C 100
D 500
M 1000   */

class Solution {
    // Finds decimal value of a given roman numeral
    public int romanToDecimal(String str) {
        // code here
        int ans = 0;

        for (int i = 0; i < str.length() - 1; i++) {
            int n1 = convert(str.charAt(i));
            int n2 = convert(str.charAt(i + 1));

            if (n1 >= n2) ans += n1;

            else
                ans -= n1;
        }

        ans += convert(str.charAt(str.length() - 1));

        return ans;
    }
    public int convert(char c) {
        switch (c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
        }
        return -1;
    }
}
