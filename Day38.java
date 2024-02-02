//Anti Diagonal Traversal of Matrix
//Give a N*N square matrix, return an array of its anti-diagonals in top-leftmost to bottom-rightmost order. In an element of a anti-diagonal (i, j), surrounding elements will be (i+1, j-1) and (i-1, j+1). Look at the examples for more clarity.

class Solution
{
    public int[] antiDiagonalPattern(int[][] matrix)
    {
        // Code here
        int n = matrix.length;
        int x = 0;
        int k = 0;
        
         // upper matrix
        int arr[] = new int[n*n];
        for(int i = 0; i < n; i++){
            k = 0;
            for(int j = i; j >= 0; j--){
                arr[x++] = matrix[k++][j];
            }
        }
        
        // lower matrix
        for(int i = 1; i < n; i++){
            k = i;
            for(int j = n-1; j >=i; j--){
                arr[x++] = matrix[k++][j];
            }
            
        }
        return arr;
    }
}
