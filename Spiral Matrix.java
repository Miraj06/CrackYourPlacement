class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> spiral = new ArrayList<>();
        if(matrix==null || matrix.length==0){
            return spiral;
        }
        int row = matrix.length;
        int col = matrix[0].length;
        int colBegin = 0, colEnd = col-1;
        int rowBegin = 0, rowEnd = row-1;

        while(colBegin <= colEnd && rowBegin <= rowEnd){
            for(int i=colBegin;i<=colEnd;i++){
                spiral.add(matrix[rowBegin][i]);
            }
            rowBegin++;

            for(int i=rowBegin;i<=rowEnd;i++){
                spiral.add(matrix[i][colEnd]);
            }
            colEnd--;

            if(rowBegin <= rowEnd){
                for(int i=colEnd;i>=colBegin;i--){
                    spiral.add(matrix[rowEnd][i]);
                }
                rowEnd--;
            }
            if(colBegin <= colEnd){
                for(int i=rowEnd;i>=rowBegin;i--){
                    spiral.add(matrix[i][colBegin]);
                }
                colBegin++;
            }
        }
      return spiral;
    }
}
