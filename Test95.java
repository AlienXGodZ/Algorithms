public class Test95 {

    public static int uniquePaths(int i, int j, int m, int n) {

        // Reached destination
        if (i == m - 1 && j == n - 1) {
            return 1;
        }

        // Outside the grid
        if (i >= m || j >= n) {
            return 0;
        }

        // Move down
        int down = uniquePaths(i + 1, j, m, n);

        // Move right
        int right = uniquePaths(i, j + 1, m, n);

        return down + right;
    }

    public static void main(String[] args) {

        int m = 3;
        int n = 3;

        int result = uniquePaths(0, 0, m, n);

        System.out.println("Unique Paths: " + result);
    }
}