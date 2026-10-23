public class Test48{
    static int N = 4;

    public static boolean safe(char[][] queenboard,int row,int col){


        for(int i = 0; i < row; i++){

            if(queenboard[i][col] == 'q'){

                return false;

            }

        }

        for(int i = row - 1, j = col - 1; i >=0 && j >= 0; i--,j--){

            if(queenboard[i][j] == 'q') {
                return false;
            }
        }

        for(int i = row - 1, j = col + 1; i >= 0 && j < N; i--,j++){

            if(queenboard[i][j] == 'q') {
                return false;
            }
        }

        return true;

    }

    public static void solve(char[][] queenboard,int row){

        if(row == N){

            printboard(queenboard);

            System.out.println();

            return;

        }

        for(int col = 0; col < N; col++){

            if(safe(queenboard,row,col)){

                queenboard[row][col] = 'q';

                solve(queenboard,row + 1);

                queenboard[row][col] = '-';

            }

        }

    }

    public static void printboard(char[][] queenboard){

        for(int i = 0; i < N; i++){

            for(int j = 0; j < N; j++){

                System.out.print(queenboard[i][j] + " ");

            }

            System.out.println();

        }
    }

    public static void main(String[] args){

        char[][] queenboard = new char[N][N];

        for(int i = 0; i < N; i++){

            for(int j = 0; j < N; j++){

                queenboard[i][j] = '-';

            }

        }

        solve(queenboard,0);

    }
}