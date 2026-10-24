import java.util.ArrayList;

public class Test50{

    static int N;

    public static void solvemaze(int[][] maze){

        N = maze.length;

        boolean[][] visited = new boolean[N][N];

        ArrayList<String> paths = new ArrayList<>();

        solvegamemoves(maze,visited,paths,"",0,0);

        for(String path : paths){

            System.out.println(path);

        }
    }

    public static void solvegamemoves(int[][] maze,boolean[][] visited,ArrayList<String> paths,String path,int row,int col){

        if(row == N-1 && col == N-1){

            paths.add(path);

            return;

        }


        if(row < 0 || col < 0 ||  row >= N || col >= N ||maze[row][col] == 0 || visited[row][col]){

            return;

        }

        visited[row][col] = true;

        solvegamemoves(maze,visited,paths,path + "D",row+1,col);

        solvegamemoves(maze,visited,paths,path + "L",row,col-1);

        solvegamemoves(maze,visited,paths,path + "R",row,col+1);

        solvegamemoves(maze,visited,paths,path + "U",row -1 ,col);

        visited[row][col] = false;

    }


    public static void main(String[] args){


        int[][] maze = {

                {1, 0, 0, 0},

                {1, 1, 0, 1},

                {0, 1, 0, 0},

                {1, 1, 1, 1}
        };

        solvemaze(maze);

    }
}