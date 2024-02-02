//Multiply two strings
//Given two numbers as strings s1 and s2. Calculate their Product.
//Note: The numbers can be negative and You are not allowed to use any built-in function or convert the strings to integers. There can be zeros in the begining of the numbers. You don't need to specify '+' sign in the begining of positive numbers.

class Solution {
    public String multiplyStrings(String s1,String s2) {
        //code here.
        int pos1 = 0, pos2 = 0;
        int flag1 = 1, flag2 = 1;
    
        if (s1.charAt(0) == '-') {
            flag1 = -1;
            pos1 = 1;
        }
        if (s2.charAt(0) == '-') {
            flag2 = -1;
            pos2 = 1;
        }

        String str1 = s1.substring(pos1);
        String str2 = s2.substring(pos2);


        int[] result = new int[str1.length() + str2.length()];
        int carry = 0;

        for(int i = str1.length() - 1; i >= 0; i--) {
            int x = Character.getNumericValue(str1.charAt(i));
            carry = 0;

            for(int j = str2.length() - 1; j >= 0; j--) {
                int y = Character.getNumericValue(str2.charAt(j));
                int product = x * y + result[i + j + 1] + carry;

                result[i + j + 1] = product % 10;
                carry = product / 10;
            }

            result[i] = carry;
        }


        StringBuilder sb = new StringBuilder();
        for (int num : result) {
            sb.append(num);
        }

  
        while (sb.length() > 0 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }

        if (sb.length() == 0) {
            return "0";
        } else {
            if(flag1 * flag2 == -1) {
                sb.insert(0, "-");
            }
            else {
                sb.insert(0,"");
            }
        }
        return sb.toString();
    }
}
