public class Test51{

    static int N;

    public static boolean exist(char[][] board,String word){

        N = board.length;

        int row = board.length;
        int col = board[0].length;

        for(int i = 0; i < row; i++){

            for(int j = 0; j < col; j++){

                if(gamemoves(board,word,i,j,0)){

                    return true;

                }

            }

        }

        return false;

    }

    public static boolean gamemoves(char[][] board,String word,int row,int col,int index){

        if(index == word.length()){

            return true;

        }

        if(row < 0 || col < 0 || row >= board.length || col >= board[0].length || board[row][col] != word.charAt(index)){

            return false;

        }

        char temp = board[row][col];

        board[row][col] = '#';


        boolean found = gamemoves(board,word,row +1,col,index+1 ) ||
                        gamemoves(board,word,row,col - 1,index + 1)||
                        gamemoves(board,word,row,col + 1,index + 1)||
                        gamemoves(board,word,row - 1,col,index + 1);


        board[row][col] = temp;

        return found;




    }

    public static void main(String[] args){


        char[][] board = {

                {'A','B','C','E'},

                {'S','F','C','S'},

                {'A','D','E','E'}
        };


        String word = "ABCCED";

        System.out.println(exist(board,word));

    }
}