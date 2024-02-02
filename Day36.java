// Modified Game of Nim
//You are given an array A of n elements. There are two players player 1 and player 2.
//A player can choose any of element from an array and remove it. If the bitwise XOR of all remaining elements equals 0 after removal of the selected element, then that player loses. Find out the winner if player 1 starts the game and they both play their best. 
//Note: If the xor of the array is initially 0, then player 1 is considered as winner.

class Solution{
    static int findWinner(int n, int A[]){
        // code here
        int xor = 0;
        for(int i=0 ; i<n ; i++){
            xor = xor^A[i];
        }
        // if xor of all values is zero then player 1 wins or if length is even player 1 wins
        if(xor == 0 || n%2 == 0){
            return 1;
        }
        // if length is odd player 2 wins
        else{
            return 2;
        }
    }
}
