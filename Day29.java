//Majority Element
//Given an array A of N elements. Find the majority element in the array. A majority element in an array A of size N is an element that appears strictly more than N/2 times in the array.

class Solution
{
    static int majorityElement(int a[], int size)
    {
        // your code here

        int result = -1;
        int Count = -1;
        int temp = 1;
        if(size == 1) {
            return a[0];
        }
        Arrays.sort(a);
        for(int i = 1; i< size; i++){
            if(a[i] == a[i-1])
            temp++;
            else temp = 1;
            if(temp > Count){
                Count = temp;
                result = a[i];
            }
        }
        //System.out.println(Count);
        //System.out.println(result);
        if (Count <= size/2) {
            return -1;
        }
        return result;
    }
}
