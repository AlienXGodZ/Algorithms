public class Test90 {

    public static int editDistance(
            String s1, String s2, int i, int j) {

        // First string is finished
        if (i == s1.length()) {
            return s2.length() - j;
        }

        // Second string is finished
        if (j == s2.length()) {
            return s1.length() - i;
        }

        // Characters match
        if (s1.charAt(i) == s2.charAt(j)) {
            return editDistance(s1, s2, i + 1, j + 1);
        }

        // Insert
        int insert = editDistance(s1, s2, i, j + 1);

        // Delete
        int delete = editDistance(s1, s2, i + 1, j);

        // Replace
        int replace = editDistance(s1, s2, i + 1, j + 1);

        return 1 + Math.min(insert,
                Math.min(delete, replace));
    }

    public static void main(String[] args) {

        String s1 = "abc";
        String s2 = "ac";

        int result = editDistance(s1, s2, 0, 0);

        System.out.println("Edit Distance: " + result);
     }
}