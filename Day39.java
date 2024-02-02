//Check if a string is repetition of its substring of k-length
//Given a string s, check if it is possible to convert it into a string that is the repetition of a substring of length k. Conversion has to be done by following the steps mentioned below only once:
//Select two indices i and j (zero-based indexing, i could be equal to j), such that i and j are divisible by k.
//Select substrings of length k starting from indices i and j.
//Replace substring starting at index i with substring starting at index j within the string
//Note: You have to convert the string using the operation only once.

class Solution
{
    int kSubstrConcat(int n, String s, int k)
    {
        // Your Code Here   
        if(n%k!=0) return 0;
        
        String ss=s.substring(0,k);
        int cnt=n/k;
        int mod=0;
        for(int i=0,j=0;j<cnt;i=i+k,j++){
            if(!s.substring(i,i+k).equals(ss)){
                mod++;
            }
        }
        if(mod>1){
            mod=0;
            String sss=s.substring(n-k,n);
            for(int i=n-k,j=0;j<cnt;i=i-k,j++){
                if(!s.substring(i,i+k).equals(sss)){
                    mod++;
                    if(mod>1) return 0;
                }
            }
        }
        return 1;
    }
}
