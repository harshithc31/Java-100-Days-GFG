//Check if string is rotated by two places
//Given two strings a and b. The task is to find if the string 'b' can be obtained by rotating (in any direction) string 'a' by exactly 2 places.

class Solution
{
    public static boolean isRotated(String str1, String str2)
    {
        // Your code here
        
        //Case1: if string. length are not equal
        if(str1.length()!=str2.length()) {
            return false;
        }
        
        //case2: str1 length is less than 2
        if(str1.length()<2){
            if(str1.equals(str2)) {
                return true;
            }
            return false;
        }
            
        //Case3: Rotating 1st 2 element
        StringBuilder sb1=new StringBuilder(str1);
        String startElem=str1.substring(0,2);
        
        sb1.delete(0,2);
        sb1.append(startElem);
        if(str2.equals(sb1.toString())) {
            return true;
            // System.out.println("Rotating 1st 2 element");
        }
        
        //Case4: Rotating last 2 element
        StringBuilder sb2=new StringBuilder(str1);
        String endElem=str1.substring(str1.length()-2);
        sb2.delete(sb2.length()-2,sb2.length());
        sb2.insert(0,endElem);
        
        if(str2.equals(sb2.toString())) {
            return true;
            // System.out.println("Rotating last 2 element");
        }
        return false;
    } 
}
