public class Test83{

    public static int lcs(String s1,String s2){

        int m = s1.length();
        int n = s2.length();

        int[] prev = new int[n + 1];
        int[] curr = new int[n + 1];

        for(int i = 1; i <= m; i++){

            for(int j = 1; j <= n; j++){

                if(s1.charAt(i - 1) == s2.charAt(j - 1)){

                    curr[j] = 1 + prev[j - 1];

                }else{

                  curr[j] = Math.max(prev[j],curr[j - 1]);

                }

            }

            prev = curr.clone();

        }

        return prev[n];

    }

    public static void main(String[] args){

        String s1 = "abc";
        String s2 = "ac";

        System.out.println("Longest Subsequence: " + lcs(s1,s2));

    }
}