class Solution {
    public int minFallingPathSum(int[][] grid) {
        int n = grid.length;
        int[][] dp = new int[n][n];
        dp[0] = grid[0];
        int res = Integer.MAX_VALUE;
        int min = Integer.MAX_VALUE;
        int minIndex = -1;
        int nextMin = Integer.MAX_VALUE;
        int nextMinIndex = -1;
        for(int i = 0; i < n; i++){
            if(grid[0][i] <= min){
                nextMinIndex = minIndex;
                nextMin = min;
                min = grid[0][i] ;
                minIndex = i;
            }else if(grid[0][i] < nextMin){
                nextMin = grid[0][i];
                nextMinIndex = i;
            }
            res = Math.min(res, grid[0][i]);
        }
        
        for(int i = 1; i < n; i++){
            res = Integer.MAX_VALUE;
            int temp1 = min;
            int temp2 = minIndex;
            int temp3 = nextMin;
            int temp4 = nextMinIndex;
            min = Integer.MAX_VALUE;
            minIndex = -1;
            nextMin = Integer.MAX_VALUE;
            nextMinIndex = -1;
             
            for(int j = 0; j < n; j++){
                if(j != temp2){
                    dp[i][j] = temp1 + grid[i][j];
                }else{
                    dp[i][j] = temp3 + grid[i][j];
                }

                if(dp[i][j] <= min){
                    nextMinIndex = minIndex;
                    nextMin = min;
                    min = dp[i][j] ;
                    minIndex = j;
                }else if(dp[i][j] < nextMin){
                    nextMin = dp[i][j];
                    nextMinIndex = j;
                }
                
                
                if(i == n - 1){
                    res = Math.min(res, dp[i][j]);
                }
            }
        }
       
        return res;
    }
}
