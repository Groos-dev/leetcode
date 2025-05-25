class Solution{
  public void rotate(int[][] matrix) {
    // HORIZONTAL REFLECTION
    int m = matrix.length;
    int n = matrix[0].length;
    for (int i = 0; i < m / 2; i++) {
      for (int j = 0; j < n; j++) {
        swap(matrix, i, j, m - 1 - i, j);
      }
    }
    // vertical reflection
    for(int i = 0; i < m; i++) {
      for(int j = i; j < n; j++) {
        swap(matrix, i, j, j, i);
      }
    }
  }
  public void (int[][] matrix, int x1, int y1, int x2, int y2){
    int temp = matrix[x1][y1];
    martix[x1][y1] = matrix[x2][y2];
    martix[x2][y2] = temp;
  }
}
