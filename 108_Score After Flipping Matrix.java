class Solution {
    public int matrixScore(int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;

        // Toggle the optimal row wise toggle
        for(int i=0; i<r; i++){
            if(grid[i][0] != 1) toggleRow(grid[i]);
        }

        // Toggling column optimisly
        for(int j=0; j<c; j++){
            int one = 0, zero = 0;

            for(int i=0; i<r; i++){
                if(grid[i][j] == 0) zero++;
                else one++;
            }

            if(one < zero) toggleColumn(grid, j);
        }

        int answer = 0;

        // convert bitwise to int value and adding to the answer
        for(int i=0; i<r; i++){
            int num = 0;

            for(int j=c-1; j>=0; j--){
                if(grid[i][j] == 1) num += (int)Math.pow(2, c-1-j);
            }

            answer += num;
        }

        return answer;
    }

    private void toggleRow(int[] row){
        for(int i=0; i<row.length; i++){
            if(row[i] == 0) row[i] = 1;
            else row[i] = 0; 
        }
    }

    private void toggleColumn(int[][] grid, int j){
        for(int i=0; i<grid.length; i++){
            if(grid[i][j] == 0) grid[i][j] = 1;
            else grid[i][j] = 0;
        }
    }
}
