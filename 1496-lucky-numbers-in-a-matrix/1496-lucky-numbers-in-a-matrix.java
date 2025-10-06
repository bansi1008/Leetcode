class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> res = new ArrayList<>();

        int r = matrix.length;
        int c = matrix[0].length;
       

        for (int i = 0; i < r; i++) {
             int min = matrix[i][0];
            int mininsdex = 0;

            for (int j = 1; j < c; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                    mininsdex = j;

                }

            }
            boolean max=true;

            for(int k=0;k<r;k++){

                if(matrix[k][mininsdex]>min){
                    max=false;
                    break;
                    
                }

            }
            if(max){
            res.add(min);
            }

        }
        return res;
    }
}