public class Test98{

    public static int minpathsum(int[][] grid,int i,int j){

        int m = grid.length;
        int n = grid[0].length;

        if(i == m - 1 && j == n - 1){

            return grid[i][j];

        }

        if(i >= m || j >= n){

            return Integer.MAX_VALUE;

        }

        int down = minpathsum(grid,i+1,j);

        int right = minpathsum(grid,i,j+1);

        return grid[i][j] + Math.min(down,right);

    }


    public static void main(String[] args){

        int[][] grid = {
                {1, 3, 1},
                {1, 5, 1},
                {4, 2, 1}
        };

        System.out.println("MinPathSum is: " + minpathsum(grid,0,0));



    }

}