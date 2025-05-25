class Solution {
  public boolean searchMatrix(int[][] matrix, int target) {
    int n = matrix.length -1;
    int m = matrix[0].length - 1;
    int i = n;
    int j = 0;
    while(i >= 0 && j <= m) {
        if(target < matrix[i][j]) {
            i--;
        } else if(target > matrix[i][j]) {
            j++;
        } else {
            return true;
        }
    }    
    return false;
  }
}
