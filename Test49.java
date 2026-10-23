public class Test49{

    static int size = 9;

    public static boolean solveboard(char[][] board) {

        for (int row = 0; row < size; row++) {

            for (int col = 0; col < size; col++) {

                if (board[row][col] == '.') {

                    for (char num = '1'; num <= '9'; num++) {

                        if (gamemoves(board, row, col, num)){

                            board[row][col] = num;

                            if(solveboard(board)){

                                return true;

                            }

                            board[row][col] = '.';

                        }


                    }

                    return false;

                }

            }

        }

        return true;

    }

    public static boolean gamemoves(char[][] board,int row,int col,int num){

        for(int i = 0; i < size; i++){

            if(board[row][i] == num){

                return false;

            }

        }

        for(int j = 0; j < size; j++){

            if(board[j][col] == num){

                return false;

            }

        }

        int startrow = row - row % 3;
        int startcol = col - col % 3;

        for(int i = 0; i < 3; i++){

            for(int j = 0; j < 3; j++){

                if(board[startrow + i][startcol + j] == num){

                    return false;

                }

            }

        }

        return true;

    }

    public static void printboard(char[][] board){

        for(int i = 0; i < size; i++){

            for(int j = 0; j < size; j++){

                System.out.print(board[i][j] + " ");

            }

            System.out.println();

        }

    }

    public static void main(String[] args){

        char[][] board = {

                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},

                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},

                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };

        if(solveboard(board)){

            System.out.println("Solved Sudoku: ");

            printboard(board);

        }else{

            System.out.println("Not Found");

        }
    }
}