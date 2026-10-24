import java.util.ArrayList;

public class Test52{

    public static void generateparentheses(int N){

        ArrayList<String> result = new ArrayList<>();

        backtrack(result,N,0,0,"");

        for(String path : result){

            System.out.println(path);

        }
    }

    public static void backtrack(ArrayList<String> result,int N,int open,int close,String current){

        if(current.length() == 2*N){

            result.add(current);
            return;

        }

        if(open < N){

            backtrack(result,N,open + 1,close,current + "(");

        }

        if(close < open){

            backtrack(result,N,open,close + 1,current + ")");

        }
    }

    public static void main(String[] args){

        int N = 3;

        generateparentheses(N);

    }
}